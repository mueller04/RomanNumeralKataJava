package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdditionTest.class,
        SubtractionTest.class,
        ConvertNumeralToIntTest.class,
        ConvertIntToNumeralTest.class})

public class TestRunner {
}
