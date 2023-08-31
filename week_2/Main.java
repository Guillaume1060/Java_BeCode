package week_2;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "week_2/covid_and_trade.csv";
        CSVReader csvReader = new CSVReader(csvFilePath);
        // Making dataList
//        List<DataModel> dataModelSet = csvReader.dataModelSet;

        // Challenge 2. Method to print unique values per column
//         csvReader.printUniqueValues();


        // Challenge 3. Filtering by year and country and rejecting re-imports values
//        csvReader.printSpecificValues(2016,"China");

        // Challenge 4. More filtering and even more transforming
//        csvReader.printValuesInEuro(0.85);

        // Challenge 5. Filtering and sorting
//        csvReader.printSortedValues(2018);

        // Challenge 6. Finding the highest value of
//        csvReader.printHighestValue();

        // Challenge 7. Check the difference of trade in 2019 and 2020 using maps and a month. (hard challenge)
        csvReader.valuesPerMonth(2019);
        csvReader.valuesPerMonth(2020);

    }
}
