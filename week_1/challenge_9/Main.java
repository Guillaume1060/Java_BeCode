package week_1.Challenge_9;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "week_1/challenge_9/hospitalFigures.csv";
        // Writing part
        CSVWriter csvWriter = new CSVWriter(csvFilePath);
        csvWriter.writeDataModels(100);
        // Reading part & statistics
        CSVReader csvReader = new CSVReader(csvFilePath);
        csvReader.getDayStatistics(LocalDate.parse("2023-08-03"));
        csvReader.getMonthStatistics(Month.AUGUST);
    }
}
