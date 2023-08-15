package week_1.Challenge_9;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CSVWriter {
    private final String csvFilePath;
    private final Random random = new Random();
    private final List<String> firstnames = Arrays.asList(
            "Alice", "Bob", "Charlie", "David", "Emma",
            "Frank", "Grace", "Henry", "Isabella", "Jack",
            "Katherine", "Liam", "Mia", "Noah", "Olivia",
            "Paul", "Quinn", "Ryan", "Sophia", "Thomas",
            "Uma", "Victor", "Wendy", "Xander", "Yasmine",
            "Zane", "Ava", "Benjamin", "Chloe", "Daniel"
    );
    private final List<String> lastnames = Arrays.asList(
            "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Miller", "Davis", "Garcia", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Perez", "Wilson",
            "Turner", "Moore", "Taylor", "Anderson", "Thomas",
            "Jackson", "White", "Harris", "Thompson", "Walker",
            "Young", "King", "Wright", "Scott", "Adams",
            "Campbell", "Hall", "Allen", "Bailey", "Cruz",
            "Diaz", "Evans", "Foster", "Gomez", "Hayes"
    );
    private final Reason[] reasons = Reason.values();
    private final List<Department> departments = new ArrayList<>(Arrays.asList(Department.values()));
    private final long startDate = LocalDate.of(2020, 1, 1).toEpochDay();

    public CSVWriter(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public void writeDataModels(int lines) {
        for (int i = 0; i < lines; i++) {
            try (FileWriter writer = new FileWriter(csvFilePath, true)) {
                String firstname = firstnames.get(random.nextInt(0, firstnames.size()));
                String lastname = lastnames.get(random.nextInt(0, lastnames.size()));
                Reason reason = reasons[random.nextInt(2)];
                Department department;
                if (reason.equals(Reason.APPOINTMENT)) {
                    department = departments.get(random.nextInt(0, departments.size()));
                } else department = Department.EMPTY;
                LocalDate visitDate = LocalDate.ofEpochDay(startDate + random.nextInt((int) (LocalDate.now().toEpochDay() - startDate)));
                writer.append(System.lineSeparator());
                writer.append(String.format("%s,%s,%s,%s,%s", firstname, lastname, reason, department, visitDate));

            } catch (IOException e) {
                System.err.println("Writing error " + e.getMessage());
            }
        }
    }
}
