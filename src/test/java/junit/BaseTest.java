package junit;


import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass
    public static void setUp() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
       Calculator calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
       Calculator calculator = null;
    }
}
