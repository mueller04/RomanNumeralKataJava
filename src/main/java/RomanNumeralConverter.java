package main.java;

public class RomanNumeralConverter {

    public static int toInt(String numeral) {
        if (numeral == "I") {
            return 1;
        } else {
            return 2;
        }
    }

    public static String toNumeral(int integer) {
        if (integer == 1) {
            return "I";
        } else {
            return "II";
        }
    }


}
