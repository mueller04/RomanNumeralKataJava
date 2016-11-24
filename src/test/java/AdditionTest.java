package test.java;

import main.java.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    Calculator calculator = new Calculator();

    @Test
    public void testIplusIequalsII(){
        String result = calculator.add("I", "I");
        assertEquals("II", result);
    }

}
