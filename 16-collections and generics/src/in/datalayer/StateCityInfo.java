package in.datalayer;

public class StateCityInfo implements Comparable<StateCityInfo>
{
    private String state,city;
    private Double score;
    
    public StateCityInfo() {
    }
    
    public StateCityInfo(final String state, final String city, final Double score) {
        this.state = state;
        this.city = city;
        this.score = score;
    }
    
    public String getState() {
        return this.state;
    }
    
    public void setState(final String state) {
        this.state = state;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public Double getScore() {
        return this.score;
    }
    
    public void setScore(final Double score) {
        this.score = score;
    }
    
    @Override
    public int compareTo(final StateCityInfo sci) {
        return this.state.compareTo(sci.getState());
    }
    
    @Override
    public String toString() {
        return "StateCityInfo [state=" + this.state + ", city=" + this.city + ", score=" + this.score + "]";
    }
}