package in.datalayer;

import java.util.Comparator;

public class ScoreComparator implements Comparator<StateCityInfo>
{
    @Override
    public int compare(final StateCityInfo sci1, final StateCityInfo sci2) {
        return sci1.getScore().compareTo(sci2.getScore());
    }
}