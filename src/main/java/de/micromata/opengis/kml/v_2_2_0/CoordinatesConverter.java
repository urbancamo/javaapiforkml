
package de.micromata.opengis.kml.v_2_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public final class CoordinatesConverter
    extends XmlAdapter<String, List<Coordinate>>
{
    private static final Pattern COORDINATE_GROUP = Pattern.compile("(?<=,|\\s|^)([-.\\d]+,[-.\\d]+(?:,[-.\\d]+)?)");

    @Override
    public String marshal(final List<Coordinate> dt)
        throws Exception
    {
        StringBuilder sb = new StringBuilder();
        for (Coordinate coord: dt) {
            sb.append(coord).append(" ");
        }
        return sb.toString().trim();
    }


    @Override
    public List<Coordinate> unmarshal(final String s)
        throws Exception
    {
        List<Coordinate> coordinates = new ArrayList<Coordinate>();
        Matcher matcher = COORDINATE_GROUP.matcher(s);
        while (matcher.find()) {
            coordinates.add(new Coordinate(matcher.group()));
        }
        return coordinates;
    }

}
