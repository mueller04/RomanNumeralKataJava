package test.java;

import main.java.Calculator;
import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter(romanNumerals);
    Calculator calculator = new Calculator(romanNumeralConverter);

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIPlusIEqualsII(){
        String result = calculator.add("I", "I");
        assertEquals("II", result);
    }

    @Test
    public void testIIPlusIIEqualsIV(){
        String result = calculator.add("II", "II");
        assertEquals("IV", result);
    }

    @Test
    public void testXLVIIPlusCLEqualsCXCIII(){
        String result = calculator.add("XLVII", "CL");
        assertEquals("CXCVII", result);
    }

    @Test
    public void testMMMPlusMMThrowsException(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("int used for toNumeral(int) cannot exceed 3999");
        calculator.add("MMM", "MM");
    }
}
