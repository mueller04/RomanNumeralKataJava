package main.java;

import java.util.Map;

public class RomanNumeralConverter {

    private Map<Integer, String> integerToNumeralMap;
    private Map<String, Integer> numeralToIntegerMap;


    public RomanNumeralConverter(RomanNumerals romanNumerals) {
        integerToNumeralMap = romanNumerals.getIntToNumeralMap();
        numeralToIntegerMap = romanNumerals.getNumeralToIntMap();
    }

    public int toInt(String numeral) {
        return numeralToIntegerMap.get(numeral);
    }

    public String toNumeral(int integer) {
        return integerToNumeralMap.get(integer);
    }


}
