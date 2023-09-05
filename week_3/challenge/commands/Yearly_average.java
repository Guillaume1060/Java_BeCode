package week_3.challenge.commands;

import week_2.DataModel;
import week_3.challenge.DataManager;

import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;

public class Yearly_average implements Command {

        String name = "monthly_total";
        String smallDescription = """
                returns the sum of both the export and import for a specified month of a specified year.""";
        String fullExplanation = """
                returns the sum of both the export and import for a specified month of a specified year.
                """;
    public Yearly_average() {
    }

    @Override
    public void execute() {
        execute("July", "2021");
    }

    @Override
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public String getFullExplanation() {
        return fullExplanation;
    }

    public void execute(String month, String year) {
        Map<Month, Long> values = DataManager.getData()
                .filter(data -> data.getYear().getValue() == Integer.parseInt(year)
                        && data.getDate().getMonth() == Month.valueOf(month.toUpperCase()))
                .collect(Collectors.groupingBy(
                        data -> data.getDate().getMonth(),
                        Collectors.summingLong(DataModel::getValue)));

        System.out.println("--->> YEAR " + year + " <<---");
        values.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + "-> " + entry.getValue()));
    }
}
