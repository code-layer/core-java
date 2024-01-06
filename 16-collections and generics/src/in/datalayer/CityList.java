package in.datalayer;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CityList
{
    public static void main(final String[] args) {
        final List cityNameList = new ArrayList();
        cityNameList.add("Delhi");
        cityNameList.add("Bombay");
        cityNameList.add("Nagpur");
        System.out.println("City Name List: " + cityNameList);
        final Iterator iter = cityNameList.iterator();
        while (iter.hasNext()) {
            System.out.println("City Name: " + iter.next());
        }
        for (final Object cityName : cityNameList) {
            System.out.println("For Loop City Name: " + (String)cityName);
        }
        System.out.println(" **** List methods *** ");
        System.out.println(" Size: " + cityNameList.size());
        System.out.println(" Element at 0 Index: " + cityNameList.get(0));
        System.out.println(" Index of Bombay City Name: " + cityNameList.indexOf("Bombay"));
        System.out.println(" Remove element Nagpur: " + cityNameList.remove("Nagpur"));
        System.out.println("Current City Name List Data");
        System.out.println(cityNameList);
    }
}