package week_1.challenge_9;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("week_1/challenge_9/hospitalFigures.csv");
        Map<String, DataModel> datas = csvReader.datas;
        for (Map.Entry<String, DataModel> entry : datas.entrySet()) {
            String row = entry.getKey();
            DataModel data = entry.getValue();
            System.out.println(row + ", Name: " + data.getFirstName());
        }

    }
}
