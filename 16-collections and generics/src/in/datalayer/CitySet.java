package in.datalayer;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class CitySet
{
    public static void main(final String[] args) {
        final Set cityNameSet = new HashSet();
        cityNameSet.add("Bombay");
        cityNameSet.add("Delhi");
        cityNameSet.add("Nagpur");
        cityNameSet.add("Bombay");
        System.out.println("City Name Set: " + cityNameSet);
        final Iterator iter = cityNameSet.iterator();
        while (iter.hasNext()) {
            System.out.println("City Name: " + iter.next());
        }
    }
}