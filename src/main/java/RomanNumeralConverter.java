package main.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralConverter {

    private LinkedHashMap<Integer, String> integerToNumeralMap;
    private Map<String, Integer> numeralToIntegerMap;


    public RomanNumeralConverter(RomanNumerals romanNumerals) {
        integerToNumeralMap = romanNumerals.getIntToNumeralMap();
        numeralToIntegerMap = romanNumerals.getNumeralToIntMap();
    }

    public int toInt(String numeral) {
        String[] numeralArray = numeral.split("");
        int result = 0;
        int previousInt = 0;

        for (int i=0; i < numeralArray.length; i++ ){
            int currentInt = numeralToIntegerMap.get(numeralArray[i]);
            result += currentInt;
            if (currentInt > previousInt) {
                result -= (previousInt * 2);
            }
            previousInt = currentInt;
        }
        return result;
    }

    public String toNumeral(int integer) {
        StringBuilder numeral = new StringBuilder();

        while (integer > 0) {
            integer = appendNextNumeral(numeral, integer);
        }
        return numeral.toString();
    }

    private int appendNextNumeral(StringBuilder numeral, int integer) {
        for (Map.Entry<Integer, String> entry : integerToNumeralMap.entrySet()) {
            int currentEntryInt = entry.getKey();

            if (integer >= currentEntryInt) {
                String numeralToAppend = entry.getValue();
                numeral.append(numeralToAppend);
                integer -= currentEntryInt;
                break;
            }
        }
                return integer;
    }

}
