package week_1.Challenge_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CSVReader {

    public static Map<String, DataModel> data = new HashMap<>();
    public CSVReader(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Line below to skip first line
            reader.readLine();
            String line;
            int rowNumber = 1;
            while ((line = reader.readLine()) != null) {
                String rowName = "row " + rowNumber;
                String[] words = line.split(" ");
                for (String word : words) {
                    data.put(rowName, createData(word));
                }
                rowNumber++;
            }
        } catch (IOException e) {
            System.err.println("Impossible to read : " + e.getMessage());
        }
    }

    private DataModel createData(String data) {
        String[] arr = data.split(",");
        return new DataModel(arr[0], arr[1], Reason.valueOf(arr[2].toUpperCase()), arr[3], LocalDate.parse(arr[4], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    private void getStatistics(List<DataModel> dataList, String label) {
        Map<Reason, Long> reasonCounts = dataList
                .stream()
                .collect(Collectors.groupingBy(DataModel::getReason, Collectors.counting()));

        Map<Department, Long> departmentCounts = dataList
                .stream()
                .collect(Collectors.groupingBy(DataModel::getDepartment, Collectors.counting()));

        System.out.println("Reason Counts for " + label + ":");
        for (Map.Entry<Reason, Long> entry : reasonCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getKey() == Reason.APPOINTMENT) {
                for (Map.Entry<Department, Long> dpt : departmentCounts.entrySet()) {
                    if (!(dpt.getKey() == Department.EMPTY)) {
                        System.out.println("     " + dpt.getKey() + ": " + dpt.getValue());
                    }
                }
            }
        }
    }

    public void getDayStatistics(LocalDate date) {
        List<DataModel> dataForDay = data.values()
                .stream()
                .filter(s -> s.getDate().equals(date))
                .toList();

        getStatistics(dataForDay, date.toString());
    }

    public void getMonthStatistics(Month month) {
        List<DataModel> dataForMonth = data.values()
                .stream()
                .filter(s -> s.getDate().getMonth() == month)
                .toList();

        getStatistics(dataForMonth, month.toString());
    }

}
