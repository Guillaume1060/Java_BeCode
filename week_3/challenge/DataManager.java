package week_3.challenge;

import week_2.CSVReader;

import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Stream;

public class DataManager {
    private static final CSVReader csvReader = new CSVReader("week_3/assets/covid_and_trade.csv");
    public static Stream<week_2.DataModel> getData() {
        return csvReader.dataModelSet
                .stream()
                .filter(data -> !Objects.equals(data.getDirection(), "Reimports"));
    }
    public static void getOverview() {
        csvReader.printOverview();
    }
}
