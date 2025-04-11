package de.micromata.opengis.kml.v_2_2_0;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CoordinatesConverterTest {

    private final static String COMMA_COORDINATE_TUPLES =
       "144.92556815,-37.75302462,0," +
       "144.92250866,-37.75137202,0," +
       "144.91917398,-37.74918087,0," +
       "144.91607408,-37.74220241,0," +
       "144.92396822,-37.73528384,0," +
       "144.92542654,-37.73525344,0," +
       "144.93609834,-37.74142729,0," +
       "144.93865024,-37.74562287,0," +
       "144.93879371,-37.74586098,0," +
       "144.93115197,-37.75120675,0," +
       "144.93001997,-37.75173478,0," +
       "144.92556815,-37.75302462,0";

    private final static String SPACE_COORDINATE_TUPLES =
            "144.92556815,-37.75302462,0 " +
            "144.92250866,-37.75137202,0 " +
            "144.91917398,-37.74918087,0 " +
            "144.91607408,-37.74220241,0 " +
            "144.92396822,-37.73528384,0 " +
            "144.92542654,-37.73525344,0 " +
            "144.93609834,-37.74142729,0 " +
            "144.93865024,-37.74562287,0 " +
            "144.93879371,-37.74586098,0 " +
            "144.93115197,-37.75120675,0 " +
            "144.93001997,-37.75173478,0 " +
            "144.92556815,-37.75302462,0";

    private final static List<Coordinate> VALID_COORDINATE_TUPLES =
        Arrays.asList(new Coordinate(144.92556815, -37.75302462, 0),
                new Coordinate(144.92250866,-37.75137202,0),
                new Coordinate(144.91917398,-37.74918087,0),
                new Coordinate(144.91607408,-37.74220241,0),
                new Coordinate(144.92396822,-37.73528384,0),
                new Coordinate(144.92542654,-37.73525344,0),
                new Coordinate(144.93609834,-37.74142729,0),
                new Coordinate(144.93865024,-37.74562287,0),
                new Coordinate(144.93879371,-37.74586098,0),
                new Coordinate(144.93115197,-37.75120675,0),
                new Coordinate(144.93001997,-37.75173478,0),
                new Coordinate(144.92556815,-37.75302462,0));

    private void checkCoordsValid(List<Coordinate> toCheck, List<Coordinate> valid) {
        assert toCheck.equals(valid);
    }

    @Test
    public void testTupleConversion() throws Exception {
        CoordinatesConverter converter = new CoordinatesConverter();
        List<Coordinate> commaSeparated = converter.unmarshal(COMMA_COORDINATE_TUPLES);
        List<Coordinate> spaceSeparated = converter.unmarshal(SPACE_COORDINATE_TUPLES);
        checkCoordsValid(commaSeparated, VALID_COORDINATE_TUPLES);
        checkCoordsValid(spaceSeparated, VALID_COORDINATE_TUPLES);
    }
}
