package week_3.challenge;

import week_2.CSVReader;
import week_2.DataModel;
import week_3.challenge.commands.Command;

import java.time.Month;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "week_3/assets/covid_and_trade.csv";
        CSVReader csvReader = new CSVReader(csvFilePath);
        Stream<DataModel> usedData = csvReader.dataModelSet
                .stream()
                .filter(data -> data.getYear().getValue() == 2021
                        && data.getDate().getMonth() == Month.JULY);

        Map<String, Command> commandManager = new CommandManager().getCommands();
        for (String data : commandManager.keySet()) {
            System.out.println(data);
        }
    }


}
