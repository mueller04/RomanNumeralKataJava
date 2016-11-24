package test.java;

import main.java.RomanNumeralConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertIntToNumeralTest {

    @Test
    public void testGiven1ReturnsI(){
        String result = RomanNumeralConverter.toNumeral(1);
        assertEquals("I", result);
    }

    @Test
    public void testGiven2ReturnsII(){
        String result = RomanNumeralConverter.toNumeral(2);
        assertEquals("II", result);
    }
}
