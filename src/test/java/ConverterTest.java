package test.java;

import main.java.RomanNumeralConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void testGivenIReturns1(){
        int result = RomanNumeralConverter.toInt("I");
        assertEquals(1, result);
    }


}
