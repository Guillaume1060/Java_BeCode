package week_3.challenge;

import week_3.challenge.commands.Command;
import week_3.challenge.commands.Monthly_total;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    static Map<String, Command> commandMap = new HashMap<>();


    private void registerCommand(String commandName, Command command) {
        commandMap.put(commandName,command);
    }

    private void executeCommand (String commandName) {
        if (commandMap.containsKey(commandName)) {
            commandMap.get(commandName).execute();
        } else {
            System.out.println("Command not found");
        }
    }
    public Map<String, Command> getCommands() {
        // Adding Commands to the Map
        Monthly_total monthly_total = new Monthly_total();
        registerCommand("monthly_total",monthly_total);

        return commandMap;
    }
}
