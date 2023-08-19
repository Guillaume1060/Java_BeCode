package week_2.Challenges.Challenge_1;

public enum Measure {
    METRE("m", 1.0),
    CENTIMETRE("cm", 0.01),
    MILLIMETRE("mm", 0.001);

    private final String symbol;
    private final double conversionToMeter;

    Measure(String symbol, double conversionToMeter) {
        this.symbol = symbol;
        this.conversionToMeter = conversionToMeter;
    }

    public static Measure fromSymbol(String symbol) {
        for (Measure measure : Measure.values()) {
            if (measure.symbol.equalsIgnoreCase(symbol)) {
                return measure;
            }
        }
        return null;
    }
    public double convertToMeter(double value) {
        return value * conversionToMeter;
    }
}
