package test.java;

import main.java.Calculator;
import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter(romanNumerals);
    Calculator calculator = new Calculator(romanNumeralConverter);

    @Test
    public void testIPlusIEqualsII(){
        String result = calculator.add("I", "I");
        assertEquals("II", result);
    }

}
