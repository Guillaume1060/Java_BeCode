package week_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;

public class DataModel {
//    Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
    private final String direction;
    private Year year;
    private LocalDate date;
    private DayOfWeek weekDay;
    private String country;
    private String commodity;
    private String transportMode;
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

    public Year getYear() {
        return year;
    }

    public LocalDate getDate() {
        return date;
    }

    public DayOfWeek getWeekDay() {
        return weekDay;
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

    public Long getValue() {
        return value;
    }

    public void setCumulative(Long cumulative) {
        this.cumulative = cumulative;
    }

    public void setValue(Long value) {
        this.value = value;
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
