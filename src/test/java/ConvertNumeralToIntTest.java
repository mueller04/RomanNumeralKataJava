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


}
