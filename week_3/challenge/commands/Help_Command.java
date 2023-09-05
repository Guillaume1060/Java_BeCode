package week_3.challenge.commands;

import week_2.DataModel;
import week_3.challenge.CommandManager;
import week_3.challenge.DataManager;

import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;

public class Help_Command implements Command {

    // TODO: 05/09/2023 -> Update by commandName
    String name = "help <Command>";
    String smallDescription = """
            returns a full explanation of what the "" does and what parameters it needs.""";
    String fullExplanation = """
            returns a full explanation of what the "" does and what parameters it needs.
            """;

    public Help_Command() {
    }

    @Override
    public void execute() {
        CommandManager commandManager = new CommandManager();
        Map<String, Command> commands = commandManager.getCommands();
        for (var command : commands.entrySet()) {
            System.out.println(command.getKey() + " : " + command.getValue().getFullExplanation());
        }
    }

    @Override
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public String getFullExplanation() {
        return fullExplanation;
    }

}
