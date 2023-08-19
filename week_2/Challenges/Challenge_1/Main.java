package week_2.Challenges.Challenge_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length measurement: ");
        String lengthInput = scanner.nextLine();

        System.out.print("Enter width measurement: ");
        String widthInput = scanner.nextLine();

        surfaceCalc(lengthInput, widthInput);
    }

    public static void surfaceCalc(String length, String width) {
        try {
            Measure lengthMeasure = getMeasure(length);
            Measure widthMeasure = getMeasure(width);
            if (lengthMeasure == null || widthMeasure == null) {
                throw new InvalidMeasurementException ("Thanks to precise measurements (m, cm or mm)");
            }
            double lengthValue = lengthMeasure.convertToMeter(getValue(length));
            double widthValue = widthMeasure.convertToMeter(getValue(width));
            System.out.printf("The surface is %s square metre (%s x %s)", lengthValue * widthValue, lengthValue, widthValue);
        } catch (InvalidMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    static Measure getMeasure(String value) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            String lengthSymbol = matcher.group();
            return Measure.fromSymbol(lengthSymbol);
        } else {
            return null;
        }
    }

    private static long getValue(String value) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            String parseValue = matcher.group();
            return Long.parseLong(parseValue);
        } else {
            return -1;
        }
    }
}

