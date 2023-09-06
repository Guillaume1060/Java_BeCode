package week_3.challenge.commands;

import week_2.DataModel;
import week_3.challenge.DataManager;

import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;

public class Yearly_total implements Command {

    String name = "yearly_total";
    String smallDescription = """
            returns an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export. Then it gives the yearly total for both import and export.""";
    String fullExplanation = """
            returns an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export. Then it gives the yearly total for both import and export.
            """;

    public Yearly_total() {
    }

    @Override
    public void execute() {
        execute("2021");
    }

    @Override
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public String getFullExplanation() {
        return fullExplanation;
    }

    public void execute(String year) {
        DataManager.valuesPerMonth(year);
    }
}
