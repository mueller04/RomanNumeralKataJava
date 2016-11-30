package test.java;

import main.java.Calculator;
import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter(romanNumerals);
    Calculator calculator = new Calculator(romanNumeralConverter);

    @Test
    public void testIIIMinusIEqualsII(){
        String result = calculator.subtract("III", "I");
        assertEquals("II", result);
    }

    @Test
    public void testMMCXMinusCXEqualsMM(){
        String result = calculator.subtract("MMCX", "CX");
        assertEquals("MM", result);
    }
}
