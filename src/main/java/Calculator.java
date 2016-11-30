package main.java;

public class Calculator {

    private RomanNumeralConverter romanNumeralConverter;

    public Calculator(RomanNumeralConverter romanNumeralConverter) {
        this.romanNumeralConverter = romanNumeralConverter;
    }

    public String add(String numeral1Str, String numberal2Str) {
        int integer1 = romanNumeralConverter.toInt(numeral1Str);
        int integer2 = romanNumeralConverter.toInt(numberal2Str);
        int additionResult = integer1 + integer2;
        String numeralResult = romanNumeralConverter.toNumeral(additionResult);
        return numeralResult;
    }

    public String subtract(String numeral1Str, String numberal2Str) {
        int integer1 = romanNumeralConverter.toInt(numeral1Str);
        int integer2 = romanNumeralConverter.toInt(numberal2Str);
        int additionResult = integer1 - integer2;
        String numeralResult = romanNumeralConverter.toNumeral(additionResult);
        return numeralResult;
    }
}
