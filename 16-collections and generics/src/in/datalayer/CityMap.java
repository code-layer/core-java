package in.datalayer;

import java.util.Map;
import java.util.HashMap;

public class CityMap
{
    public static void main(final String[] args) {
        final Map cityMap = new HashMap();
        cityMap.put("capital", "Delhi");
        cityMap.put("financialCity", "Bombay");
        cityMap.put("orangeCity", "Nagpur");
        System.out.println("City Map: " + cityMap);
        System.out.println(" *** Display Map Entries one by one *** ");
        for (final Object key : cityMap.keySet()) {
            System.out.println("Key : " + (String)key + " Value: " + cityMap.get(key));
        }
        System.out.println(" *** Map methods **** ");
        System.out.println("cityMap size : " + cityMap.size());
        System.out.println("check key capital in cityMap : " + cityMap.containsKey("capital"));
        System.out.println(cityMap.get("financialCity"));
        System.out.println("remove key orangeCity : " + cityMap.remove("orangeCity"));
    }
}