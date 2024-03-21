package de.micromata.opengis.kml.v_2_2_0.util;

public class DoubleCompare {
    private final static double EPSILON = 0.000001d;

    public static boolean equal(Double d1, Double d2) {
        return d1 != null && d2 != null && Math.abs(d1 - d2) < EPSILON;
    }

    public static boolean notEqual(Double d1, Double d2) {
        return !equal(d1, d2);
    }
}
