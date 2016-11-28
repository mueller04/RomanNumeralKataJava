package test.java;

import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertNumeralToIntTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter underTest = new RomanNumeralConverter(romanNumerals);

    @Test
    public void testGivenIReturns1(){
        int result = underTest.toInt("I");
        assertEquals(1, result);
    }

    @Test
    public void testGivenIIReturns2(){
        int result = underTest.toInt("II");
        assertEquals(2, result);
    }

    @Test
    public void testGivenIIIReturns3(){
        int result = underTest.toInt("III");
        assertEquals(3, result);
    }

    @Test
    public void testGivenVReturns5(){
        int result = underTest.toInt("V");
        assertEquals(5, result);
    }

    @Test
    public void testGivenIVReturns4(){
        int result = underTest.toInt("IV");
        assertEquals(4, result);
    }

    @Test
    public void testGivenVIReturns6(){
        int result = underTest.toInt("VI");
        assertEquals(6, result);
    }

    @Test
    public void testGivenVIIReturns7(){
        int result = underTest.toInt("VII");
        assertEquals(7, result);
    }

    @Test
    public void testGivenVIIIReturns8(){
        int result = underTest.toInt("VIII");
        assertEquals(8, result);
    }

    @Test
    public void testGivenIXReturns9(){
        int result = underTest.toInt("IX");
        assertEquals(9, result);
    }


}
