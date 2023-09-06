package week_3.challenge.commands;

import week_3.challenge.CommandManager;

import java.util.Map;

public class Quit implements Command {

        String name = "quit";
        String smallDescription = """
                Quit program.""";
        String fullExplanation = """
                Quit program.
                """;
    public Quit() {
    }

    @Override
    public void execute() {}

    @Override
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public String getFullExplanation() {
        return fullExplanation;
    }


}
