package week_1.Challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Week_1 {
    private static final Random random = new Random();

    /*
    CHALLENGE 1
    byte aByte = 127;
    short aShort = 32_767;
    int anInt = 2_147_483_646;
    long aLong = 9_223_372_036_854_775_807L;
    float aFloat = 7.55f;
    double aDouble = 5.55;
    char aChar = 'Z';
    boolean aBoolean = true

    CHALLENGE 4
    Write a small program that will build up a random array of non-primitive integers, and 0 is a valid entry.
    Now loop over the array and divide each integer with the previous integer.
    The first integer can be divided by itself.
    How will you make sure that the program doesn't crash when dividing by zero?
    This challenge can be a way to introduce exceptions, try catch blocks, etc.
     */
    public static int[] arrBuilder(int arrLength) {
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int randomInt = random.nextInt(0, 10);
            arr[i] = randomInt;
        }
        return arr;
    }

    public static void arrDivider(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            try {
                arr[i] = arr[i] / arr[i - 1];
            } catch (ArithmeticException e) {
//                System.out.println("Impossible to divide per 0, we return 0 for the index " + i);
                arr[i] = 0;
                return;
            }
        }
    }

    /*
     CHALLENGE 5
     Write a program that reads in a text file and then counts the appearance of words line by line.
     The result should be an overview of how many times each word was in the text.
     Challenge 5 bis: Most frequently used word
     The same as challenge 5, but now we also want to know which word was used the most.
     */
    public static Map<String, Integer> wordCounter(String filePath) throws IOException {
        ArrayList<String> wordList = new ArrayList<>();
        Map<String, Integer> wordCounter = new HashMap<>();
        // We loop each line and stock word in an array, then an ArrList
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String sentence = line.replaceAll("[\\p{P}]", "");
                String[] words = sentence.split(" ");
                for (String word : words) {
                    wordList.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            System.err.println("Impossible to read : " + e.getMessage());
        }
        // We add values in a Map and print it.
        for (String word : wordList) {
            wordCounter.merge(word, 0, (oldCount, newCount) -> oldCount + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return wordCounter;
    }

    // CHALLENGE 6 - LetterCounter
    public static Map<Character, Integer> letterCounter(Map<String, Integer> wordMap) {
        Map<Character, Integer> letterList = new HashMap<>();
        for (String word : wordMap.keySet()) {
            for (Character letter : word.toCharArray()) {
                letterList.merge(letter, 0, (oldCount, newCount) -> oldCount + 1);
            }
        }
        return letterList;
    }

}
