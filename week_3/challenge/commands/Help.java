package week_3.challenge.commands;

import week_3.challenge.CommandManager;

import java.util.Map;

public class Help implements Command {

        String name = "help";
        String smallDescription = """
                returns a list of available commands with a small description.""";
        String fullExplanation = """
                returns a list of available commands with a small description.
                """;
    public Help() {
    }

    @Override
    public void execute() {
        CommandManager commandManager = new CommandManager();
        Map<String, Command> commands = commandManager.getCommands();
        for (var command : commands.entrySet()) {
            System.out.println(command.getKey()+" : "+command.getValue().getSmallDescription());
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
