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
            checkIntOutOfBounds(result, "Result cannot exceed 3999");
            previousInt = currentInt;
        }
        return result;
    }

    public String toNumeral(int integer) {
        checkIntOutOfBounds(integer, "int used for toNumeral(int) cannot exceed 3999");
        StringBuilder numeral = new StringBuilder();

        while (integer > 0) {
            AppendNumeralResult appendResult = appendNextNumeral(integer);
            numeral.append(appendResult.getNumeralToAppend());
            integer -= appendResult.getValueOfAppendedNumeralToSubtract();
        }
        return numeral.toString();
    }

    private AppendNumeralResult appendNextNumeral(int integer) {
        int currentEntryInt = integer;
        for (Map.Entry<Integer, String> entry : integerToNumeralMap.entrySet()) {
            currentEntryInt = entry.getKey();

            if (integer >= currentEntryInt) {
                String numeralToAppend = entry.getValue();
                return new AppendNumeralResult(numeralToAppend, currentEntryInt);
            }
        }
        return new AppendNumeralResult("", currentEntryInt);
    }

    private void checkIntOutOfBounds(int integer, String errorMessage) {
        if (integer > 3999) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

}
