package week_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class CSVReader {
    public List<DataModel> dataModelSet = new LinkedList<>();
    public HashSet<String>[] uniqueValuesPerColumn = new HashSet[10];

    public CSVReader(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Line below to skip first line
            reader.readLine();
            String line;

            // Generating HashSet
            for (int i = 0; i < uniqueValuesPerColumn.length; i++) {
                uniqueValuesPerColumn[i] = new HashSet<>();
            }

            while ((line = reader.readLine()) != null) {
                // CreatingData
                String[] words = line.split("\\n");
                for (String word : words) {
                    dataModelSet.add(createData(word));
                }

                // Collect unique values for each column
                String[] columns = line.split("(?!\\B\"[^\"]*),(?![^\"]*\"\\B)");
                for (int i = 0; i < columns.length; i++) {
                    uniqueValuesPerColumn[i].add(columns[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Impossible to read : " + e.getMessage());
        }
    }

    private DataModel createData(String data) {
        String[] arr = data.split("(?!\\B\"[^\"]*),(?![^\"]*\"\\B)");
        return new DataModel(arr[0], Year.of(Integer.parseInt(arr[1])), LocalDate.parse(arr[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), DayOfWeek.valueOf(arr[3].toUpperCase()), arr[4], arr[5], arr[6], arr[7], Long.parseLong(arr[8]), Long.parseLong(arr[9]));
    }

    public void printUniqueValues() {
        for (int i = 0; i < uniqueValuesPerColumn.length; i++) {
            System.out.println("Column " + (i + 1) + " unique values: " + uniqueValuesPerColumn[i]);
        }
    }

    public void printSpecificValues(int year, String country) {
        dataModelSet.stream()
                .filter(line -> line.getYear().getValue() == year && line.getCountry().equals(country) && !line.getDirection().equals("Reimports"))
                .forEach(System.out::println);
    }

    public void printValuesInEuro(double exchangeRate) {
        dataModelSet.stream()
                .filter(line -> line.getYear().getValue() == 2016 && !line.getDirection().equals("Reimports"))
                .peek(line -> {
                    if (line.getMeasure().equals("$")) {
                        line.setMeasure("Eur");
                        line.setValue((long) (line.getValue() * exchangeRate));
                        line.setCumulative((long) (line.getCumulative() * exchangeRate));
                    }
                })
                .forEach(System.out::println);
    }

    public void printSortedValues(int year) {
        dataModelSet.stream()
                .filter(line -> line.getYear().getValue() == year
                        && line.getDirection().equals("Imports")
                        && line.getCountry().equals("All")
                        && line.getCommodity().equals("All")
                        && line.getTransportMode().equals("All"))
                .sorted(Comparator.comparing(DataModel::getValue))
                .forEach(System.out::println);
    }

    public void printHighestValue() {
        var max = dataModelSet.stream()
                .filter(line -> line.getYear().getValue() == 2019
                        && line.getDirection().equals("Exports")
                        && line.getCountry().equals("China")
                        && line.getCommodity().equals("All")
                        && line.getTransportMode().equals("All"))
                .max(Comparator.comparing(DataModel::getValue));
        System.out.println(max);
    }

    public void valuesPerMonth(int year) {
        Map<Month, Long> valuesPerMonth = dataModelSet.stream()
                .filter(line -> line.getDirection().equals("Exports")
                        && line.getCountry().equals("European Union (27)")
                        && line.getYear().getValue() == year)
                .collect(Collectors.groupingBy(
                        data -> data.getDate().getMonth(),
                        Collectors.summingLong(DataModel::getValue)
                ));

        System.out.println("--->> YEAR " + year + " <<---");
        valuesPerMonth.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + "-> " + entry.getValue()));

    }
}
