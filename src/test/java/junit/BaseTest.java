package junit;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest {
     public Calculator calculator;

    @BeforeClass
    public static void setUp1() {
        Calculator calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown1() {
        Calculator calculator = new Calculator();
    }
}
