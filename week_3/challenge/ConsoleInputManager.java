package week_3.challenge;

import week_3.challenge.commands.Command;

import java.util.Map;
import java.util.Scanner;

public class ConsoleInputManager {
    private static final Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        boolean end = false;
        while (!end) {
            // Interaction with the client
            CommandManager commandManager = new CommandManager();
            Map<String, Command> commands = commandManager.getCommands();
            System.out.println("Type your command :");
            for (String data : commands.keySet()) {
                System.out.println("\t" + data);
            }
//            if (scanner.nextLine().equalsIgnoreCase("MONTHLY_TOTAL")) {
//                System.out.println("Which year ?");
//            }
            commandManager.executeCommand(scanner.nextLine().toUpperCase());
            end = true;

        }
    }

}
