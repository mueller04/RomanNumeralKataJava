package test.java;

import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertIntToNumeralTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter underTest = new RomanNumeralConverter(romanNumerals);

    @Test
    public void testGiven1ReturnsI(){
        String result = underTest.toNumeral(1);
        assertEquals("I", result);
    }

    @Test
    public void testGiven2ReturnsII(){
        String result = underTest.toNumeral(2);
        assertEquals("II", result);
    }
}
