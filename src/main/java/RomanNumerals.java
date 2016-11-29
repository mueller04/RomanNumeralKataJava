package main.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanNumerals {

    private LinkedHashMap<Integer, String> intToNumeralMap;
    private HashMap<String, Integer> numeralToIntMap;


    public RomanNumerals() {
        intToNumeralMap = new LinkedHashMap<>();
        intToNumeralMap.put(10, "X");
        intToNumeralMap.put(9, "IX");
        intToNumeralMap.put(5, "V");
        intToNumeralMap.put(4, "IV");
        intToNumeralMap.put(1, "I");


        numeralToIntMap = new HashMap<>();
        numeralToIntMap.put("I", 1);
        numeralToIntMap.put("V", 5);
        numeralToIntMap.put("X", 10);
        numeralToIntMap.put("L", 50);
        numeralToIntMap.put("C", 100);
        numeralToIntMap.put("D", 500);
        numeralToIntMap.put("M", 1000);
    }

    public LinkedHashMap<Integer, String> getIntToNumeralMap() {
        return intToNumeralMap;
    }

    public HashMap<String, Integer> getNumeralToIntMap() {
        return numeralToIntMap;
    }
}
