package de.micromata.opengis.kml.v_2_2_0;

import org.junit.Test;

public class IconTest {
   @Test
    public void hashCodeTest() {
        Icon icon1 = new Icon();
        Icon icon2 = new Icon();

        // Ensure we don't get an NPE
        assert(icon1.hashCode() == icon2.hashCode());
   }
}
