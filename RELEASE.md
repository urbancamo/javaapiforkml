# Release Process

This project publishes to Maven Central via Sonatype's Central Publishing plugin
(`org.sonatype.central:central-publishing-maven-plugin`, configured in the `release`
Maven profile in `pom.xml`). Artifacts must be GPG-signed before Sonatype will accept
them.

There are two parts to this document:

1. [One-time machine setup](#one-time-machine-setup) — needed once per machine/maintainer.
2. [Release steps](#release-steps) — done for every release.

No private keys, passphrases, or account credentials are included in this file. Where a
value below looks like a secret, it is a placeholder for you to fill in locally (in your
keychain / `~/.m2/settings.xml`), never committed to this repo.

## One-time machine setup

### 1. Install GnuPG and a GUI pinentry

On macOS, use `pinentry-mac` so passphrase prompts appear as a native dialog rather than
requiring a terminal TTY (Maven/IDE-launched builds often don't have one):

```sh
brew install gnupg pinentry-mac
mkdir -p ~/.gnupg
echo "pinentry-program $(brew --prefix)/bin/pinentry-mac" > ~/.gnupg/gpg-agent.conf
gpgconf --kill gpg-agent
```

> When the passphrase dialog appears, respond promptly — `pinentry-mac` will time out and
> report `Operation cancelled` back to Maven if left unanswered for too long.

### 2. Generate a signing key (if you don't already have one)

```sh
gpg --quick-generate-key "Your Name <you@example.com>" ed25519 sign 3y
```

You'll be prompted (via the GUI dialog) to set a passphrase. **Save it in a password
manager immediately** — GPG has no password-recovery mechanism. If it's lost, the only
fix is generating a brand-new key and repeating this whole setup section.

List your key and note the fingerprint:

```sh
gpg --list-secret-keys --keyid-format LONG
```

### 3. Publish the public key to keyservers

Sonatype Central validates signatures by checking that the public key is discoverable on
a public keyserver. Publish to at least these two (the public key is not secret — this is
expected and safe):

```sh
gpg --keyserver keys.openpgp.org --send-keys <FINGERPRINT>
gpg --keyserver keyserver.ubuntu.com --send-keys <FINGERPRINT>
```

If `keys.openpgp.org` doesn't show your email as verified, check your inbox for a
verification link from them — until verified, the key is still resolvable by fingerprint,
but not by searching your email address.

### 4. Point the build at your key

`pom.xml`'s `release` profile pins `maven-gpg-plugin` to a specific key via
`<keyname>` (the current project key's fingerprint is
`893A85B05C986CD843FB8C87B8E90133B74536D0` — this is public information, safe to
reference). If you rotate keys, update that value.

### 5. Create a Sonatype Central account and user token

1. Sign in / register at https://central.sonatype.com
2. Confirm you have publishing access to the `uk.m0nom` namespace.
3. Go to **Account → Generate User Token**.
4. Add the generated credentials to `~/.m2/settings.xml` (create the file if it doesn't
   exist):

   ```xml
   <settings>
     <servers>
       <server>
         <id>central</id>
         <username>YOUR_TOKEN_USERNAME</username>
         <password>YOUR_TOKEN_PASSWORD</password>
       </server>
     </servers>
   </settings>
   ```

   Tokens can be freely regenerated/revoked from the same page if needed — you don't need
   to remember or recover them.

## Release steps

Run these from a clean, up-to-date checkout of `main`/`master`.

1. **Confirm the working tree is clean and tests pass:**
   ```sh
   git status
   mvn clean verify
   ```

2. **Set the release version** in `pom.xml` (drop any `-SNAPSHOT` suffix), e.g. `3.1.2`.

3. **Update `README.md`** if there are user-facing changes worth calling out.

4. **Commit the release:**
   ```sh
   git add pom.xml README.md
   git commit -m "Release 3.1.2 - <short summary>"
   ```

5. **Build, sign, and deploy:**
   ```sh
   mvn -Prelease clean deploy
   ```
   This runs the full test suite, builds the jar/sources/javadoc, GPG-signs all four
   artifacts, bundles them, and uploads to Sonatype Central. Watch for the
   `pinentry-mac` passphrase dialog partway through and respond to it — the build will
   pause here.

   A successful run ends with something like:
   ```
   [INFO] Deployment <uuid> has been validated. To finish publishing visit https://central.sonatype.com/publishing/deployments
   [INFO] BUILD SUCCESS
   ```

6. **Manually publish the deployment** (Sonatype does not auto-publish):
   - Go to https://central.sonatype.com/publishing/deployments
   - Find the new deployment (status should be `VALIDATED`)
   - Review it, then click **Publish**
   - If something looks wrong, click **Drop** instead — nothing is public yet at this
     stage, so it's safe to discard and re-run step 5 after fixing the issue

7. **Tag and push:**
   ```sh
   git tag 3.1.2
   git push origin main --tags
   ```

8. **Bump to the next snapshot version** so `main` doesn't sit on a released version:
   ```sh
   # edit pom.xml: <version>3.1.3-SNAPSHOT</version>
   git add pom.xml
   git commit -m "Next SNAPSHOT release"
   git push origin main
   ```

9. **Verify propagation** (usually 15–30 minutes after publishing):
   - https://central.sonatype.com/artifact/uk.m0nom/javaapiforkml
   - https://repo1.maven.org/maven2/uk/m0nom/javaapiforkml/

## Troubleshooting

- **`gpg: signing failed: No such file or directory`** — GPG/pinentry can't find a TTY
  or GUI to prompt for the passphrase. Confirm `~/.gnupg/gpg-agent.conf` points at
  `pinentry-mac` and that `gpg-agent` was restarted (`gpgconf --kill gpg-agent`) after
  editing it.
- **`gpg: signing failed: Operation cancelled`** — the `pinentry-mac` dialog appeared but
  timed out before being answered. Just re-run `mvn -Prelease clean deploy` and respond
  to the dialog promptly this time.
- **Forgot the GPG passphrase** — unrecoverable by design. Repeat the
  [one-time machine setup](#one-time-machine-setup) steps 2–4 to generate and wire up a
  new key, then use that for future releases. Artifacts already published under the old
  key are unaffected.
- **Deployment stuck in `PENDING` / fails validation** on the Central portal — check the
  failure reason shown there; common causes are a missing/unverifiable GPG signature
  (see keyserver step above) or missing javadoc/sources jars.
