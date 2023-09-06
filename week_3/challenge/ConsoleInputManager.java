package week_3.challenge;

import week_3.challenge.commands.Command;

import java.util.Map;
import java.util.Scanner;

public class ConsoleInputManager {
    private static final Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        // TODO: 06/09/2023_Adding year & month params for each command.
        boolean end = false;
        CommandManager commandManager = new CommandManager();
        Map<String, Command> commands = commandManager.getCommands();
        while (!end) {
            // Interaction with the client
            System.out.println("Type your command :");
            for (String command : commands.keySet()) {
                System.out.println("\t" + command);
            }
//            if (scanner.nextLine().equalsIgnoreCase("MONTHLY_TOTAL")) {
//                System.out.println("Which year ?");
//            }
            String answer = scanner.nextLine().toUpperCase();
            if (answer.equals("QUIT")) end = true;
            commandManager.executeCommand(answer);


        }
    }

}
