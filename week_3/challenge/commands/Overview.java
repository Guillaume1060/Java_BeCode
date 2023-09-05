package week_3.challenge.commands;

import week_2.DataModel;
import week_3.challenge.DataManager;

import java.time.Month;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class Overview implements Command {
        String name = "overview";
        String smallDescription = """
                returns all the unique values that span the data set: years, countries, commodities, transportation modes and measures.""";
        String fullExplanation = """
                returns all the unique values that span the data set: years, countries, commodities, transportation modes and measures.
                """;
    public Overview() {
    }

    @Override
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public String getFullExplanation() {
        return fullExplanation;
    }

    public void execute() {
        DataManager.getOverview();
    }
}
