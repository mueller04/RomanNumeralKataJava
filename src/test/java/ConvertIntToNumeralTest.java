package test.java;

import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ConvertIntToNumeralTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter underTest = new RomanNumeralConverter(romanNumerals);

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void testGiven10ReturnsX(){
        String result = underTest.toNumeral(10);
        assertEquals("X", result);
    }

    @Test
    public void testGiven14ReturnsXIV(){
        String result = underTest.toNumeral(14);
        assertEquals("XIV", result);
    }

    @Test
    public void testGiven40ReturnsXL(){
        String result = underTest.toNumeral(40);
        assertEquals("XL", result);
    }

    @Test
    public void testGiven50ReturnsL(){
        String result = underTest.toNumeral(50);
        assertEquals("L", result);
    }

    @Test
    public void testGiven90ReturnsXC(){
        String result = underTest.toNumeral(90);
        assertEquals("XC", result);
    }

    @Test
    public void testGiven100ReturnsC(){
        String result = underTest.toNumeral(100);
        assertEquals("C", result);
    }

    @Test
    public void testGiven400ReturnsCD(){
        String result = underTest.toNumeral(400);
        assertEquals("CD", result);
    }

    @Test
    public void testGiven500ReturnsD(){
        String result = underTest.toNumeral(500);
        assertEquals("D", result);
    }

    @Test
    public void testGiven900ReturnsCM(){
        String result = underTest.toNumeral(900);
        assertEquals("CM", result);
    }

    @Test
    public void testGiven1000ReturnsM(){
        String result = underTest.toNumeral(1000);
        assertEquals("M", result);
    }

    @Test
    public void testGiven2000ReturnsM(){
        String result = underTest.toNumeral(2000);
        assertEquals("MM", result);
    }

    @Test
    public void testGiven3999ReturnsMMMCMXCIX(){
        String result = underTest.toNumeral(3999);
        assertEquals("MMMCMXCIX", result);
    }

    @Test
    public void testGivenMMMMThrowsException(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("int used for toNumeral(int) cannot exceed 3999");

        underTest.toNumeral(4000);
    }
}
