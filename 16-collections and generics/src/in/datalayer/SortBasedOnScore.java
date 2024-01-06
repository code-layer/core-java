package in.datalayer;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortBasedOnScore
{
    public static void main(final String[] args) {
        final StateCityInfo sci1 = new StateCityInfo("DL", "New Delhi", 75.0);
        final StateCityInfo sci2 = new StateCityInfo("TN", "Chennai", 420.45);
        final StateCityInfo sci3 = new StateCityInfo("AP", "Vizag", 120.45);
        final SortedSet dataSet = new TreeSet(new ScoreComparator());
        dataSet.add(sci1);
        dataSet.add(sci2);
        dataSet.add(sci3);
        System.out.println(" *** Geo Data using Comprator : Sort on Score *** ");
        final Iterator iter = dataSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}