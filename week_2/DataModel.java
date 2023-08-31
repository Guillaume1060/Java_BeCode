package week_2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;

public class DataModel {
//    Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
    private final String direction;
    private final Year year;
    private final LocalDate date;
    private final DayOfWeek weekDay;
    private final String country;
    private final String commodity;
    private final String transportMode;
    private String measure;
    private Long value;
    private Long cumulative;

    public DataModel(String direction, Year year, LocalDate date, DayOfWeek weekDay, String country, String commodity, String transportMode, String measure, Long value, Long cumulative) {
        this.direction = direction;
        this.year = year;
        this.date = date;
        this.weekDay = weekDay;
        this.country = country;
        this.commodity = commodity;
        this.transportMode = transportMode;
        this.measure = measure;
        this.value = value;
        this.cumulative = cumulative;
    }

    public String getDirection() {
        return direction;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public String getCommodity() {
        return commodity;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public String getMeasure() {
        return measure;
    }

    public void setCumulative(Long cumulative) {
        this.cumulative = cumulative;
    }


    public Long getCumulative() {
        return cumulative;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Data :" +
                "direction='" + direction + '\'' +
                ", year=" + year +
                ", date=" + date +
                ", weekDay=" + weekDay +
                ", country='" + country + '\'' +
                ", commodity='" + commodity + '\'' +
                ", transportMode='" + transportMode + '\'' +
                ", measure='" + measure + '\'' +
                ", value=" + value +
                ", cumulative=" + cumulative;
    }

}
