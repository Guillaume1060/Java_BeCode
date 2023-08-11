package week_1.challenge_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {
    private String filePath;
    public Map<String, DataModel> datas = new HashMap<>();

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
                    datas.put(rowName, createData(word));
                }
                rowNumber++;

            }
        } catch (IOException e) {
            System.err.println("Impossible to read : " + e.getMessage());
        }
    }

    private DataModel createData(String data) {
        String[] arr = data.split(",");
        System.out.println(Arrays.toString(arr));
        return new DataModel(arr[0], arr[1], Reason.valueOf(arr[2].toUpperCase()), arr[3], LocalDate.parse(arr[4], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
