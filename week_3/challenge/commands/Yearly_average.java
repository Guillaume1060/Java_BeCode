package week_3.challenge.commands;

import week_3.challenge.DataManager;

public class Yearly_average implements Command {

    String name = "yearly_average";
    String smallDescription = """
            returns an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export.""";
    String fullExplanation = """
            returns an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export.
            """;

    public Yearly_average() {
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
        DataManager.valuesPerMonthAverage(year);
    }
}
