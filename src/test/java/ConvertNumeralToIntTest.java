package test.java;

import main.java.RomanNumeralConverter;
import main.java.RomanNumerals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ConvertNumeralToIntTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    RomanNumeralConverter underTest = new RomanNumeralConverter(romanNumerals);

    @Rule
    public ExpectedException thrown = ExpectedException.none();


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

    @Test
    public void testGivenXReturns10(){
        int result = underTest.toInt("X");
        assertEquals(10, result);
    }

    @Test
    public void testGivenXIReturns11(){
        int result = underTest.toInt("XI");
        assertEquals(11, result);
    }

    @Test
    public void testGivenXXIReturns21(){
        int result = underTest.toInt("XXI");
        assertEquals(21, result);
    }

    @Test
    public void testGivenXLReturns40(){
        int result = underTest.toInt("XL");
        assertEquals(40, result);
    }

    @Test
    public void testGivenLReturns50(){
        int result = underTest.toInt("L");
        assertEquals(50, result);
    }

    @Test
    public void testGivenXCReturns90(){
        int result = underTest.toInt("XC");
        assertEquals(90, result);
    }

    @Test
    public void testGivenCReturns100(){
        int result = underTest.toInt("C");
        assertEquals(100, result);
    }

    @Test
    public void testGivenCLReturns150(){
        int result = underTest.toInt("CL");
        assertEquals(150, result);
    }

    @Test
    public void testGivenCDReturns400(){
        int result = underTest.toInt("CD");
        assertEquals(400, result);
    }

    @Test
    public void testGivenDReturns500(){
        int result = underTest.toInt("D");
        assertEquals(500, result);
    }

    @Test
    public void testGivenCMReturns900(){
        int result = underTest.toInt("CM");
        assertEquals(900, result);
    }

    @Test
    public void testGivenMReturns1000(){
        int result = underTest.toInt("M");
        assertEquals(1000, result);
    }

    @Test
    public void testGivenMCMXCIXReturns1999(){
        int result = underTest.toInt("MCMXCIX");
        assertEquals(1999, result);
    }

    @Test
    public void testGivenMMCDXXXReturns2420(){
        int result = underTest.toInt("MMCDXX");
        assertEquals(2420, result);
    }

    @Test
    public void testGivenMMMCMXCIXReturns3999(){
        int result = underTest.toInt("MMMCMXCIX");
        assertEquals(3999, result);
    }

    @Test
    public void testGivenMMMMThrowsException(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Result cannot exceed 3999");

        underTest.toInt("MMMM");
    }

    @Test
    public void testGivenYThrowsException(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("toInt(numeral) Invalid Numeral: Y");

        underTest.toInt("Y");
    }
}
