package week_1;

import week_1.Challenges.Week_1;

import java.io.IOException;
import java.util.Map;

public class Main {
    public Main() throws IOException {
    }
    public static void main(String[] args) throws IOException {
        // CHALLENGE 4
        int[] arr = Week_1.arrBuilder(10);
//        System.out.println(Arrays.toString(arr));
        Week_1.arrDivider(arr);
//        System.out.println(Arrays.toString(arr));

        // CHALLENGE 5
        Map<String,Integer> wordCounter = Week_1.wordCounter("week_1/Text.txt");
        int wordMostUsed = wordCounter
                .values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0); // terminalOperation
        // Print mostUsedWord
        wordCounter.entrySet()
                .stream()
                .filter(s->s.getValue()==wordMostUsed)
                .forEach(s->System.out.printf("'%s' is the most used word with %s use%n", s.getKey(),s.getValue()));

        // CHALLENGE 6
        Map<Character,Integer> letterCounter = Week_1.letterCounter(wordCounter);
        int letterMostUsed = letterCounter
                .values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0); // terminalOperation
        // Print mostUsedLetter
        letterCounter.entrySet()
                .stream()
                .filter(s->s.getValue()==letterMostUsed)
                .forEach(s->System.out.printf("'%s' is the most used letter with %s use%n", s.getKey(),s.getValue()));
    }
}
