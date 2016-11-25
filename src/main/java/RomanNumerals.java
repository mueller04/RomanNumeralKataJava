package main.java;

import java.util.HashMap;

public class RomanNumerals {

    private HashMap<Integer, String> intToNumeralMap;
    private HashMap<String, Integer> numeralToIntMap;


    public RomanNumerals() {
        intToNumeralMap = new HashMap<>();
        intToNumeralMap.put(1, "I");
        intToNumeralMap.put(2, "II");

        numeralToIntMap = new HashMap<>();
        numeralToIntMap.put("I", 1);
        numeralToIntMap.put("II", 2);
        numeralToIntMap.put("III", 3);
    }

    public HashMap<Integer, String> getIntToNumeralMap() {
        return intToNumeralMap;
    }

    public HashMap<String, Integer> getNumeralToIntMap() {
        return numeralToIntMap;
    }
}