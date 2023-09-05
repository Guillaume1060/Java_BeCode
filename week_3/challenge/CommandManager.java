package week_3.challenge;

import week_3.challenge.commands.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CommandManager {
    static Map<String, Command> commandMap = new LinkedHashMap<>();


    private void registerCommand(String commandName, Command command) {
        commandMap.put(commandName,command);
    }

    public void executeCommand (String commandName) {
        if (commandMap.containsKey(commandName)) {
            commandMap.get(commandName).execute();
        } else {
            System.out.println("Command not found");
        }
    }
    public Map<String, Command> getCommands() {
        // Adding Commands to the Map
        Help help = new Help();
        registerCommand("HELP",help);
        Help_Command helpCommand = new Help_Command();
        registerCommand("HELP <Command>",helpCommand);
        Monthly_total monthly_total = new Monthly_total();
        registerCommand("MONTHLY_TOTAL",monthly_total);
        Monthly_average monthly_average = new Monthly_average();
        registerCommand("MONTHLY_AVERAGE",monthly_total);
        Yearly_total yearly_total = new Yearly_total();
        registerCommand("YEARLY_TOTAL",yearly_total);
        Yearly_average yearly_average = new Yearly_average();
        registerCommand("YEARLY_AVERAGE",yearly_average);
        Overview overview = new Overview();
        registerCommand("OVERVIEW",overview);
        return commandMap;
    }
}
