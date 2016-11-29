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

    @Test
    public void testGiven3ReturnsIII(){
        String result = underTest.toNumeral(3);
        assertEquals("III", result);
    }

    @Test
    public void testGiven5ReturnsV(){
        String result = underTest.toNumeral(5);
        assertEquals("V", result);
    }

    @Test
    public void testGiven6ReturnsVI(){
        String result = underTest.toNumeral(6);
        assertEquals("VI", result);
    }

    @Test
    public void testGiven4ReturnsIV(){
        String result = underTest.toNumeral(4);
        assertEquals("IV", result);
    }

    @Test
    public void testGiven9ReturnsIX(){
        String result = underTest.toNumeral(9);
        assertEquals("IX", result);
    }
}
