package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        calculator = null;
    }
}
