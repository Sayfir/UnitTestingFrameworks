package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Test;

public class DivisionCalculationByZero extends BaseTest {
    @Test(expected = NumberFormatException.class)
    public void testGetDevidedByNullException() {
        Calculator calculator = new Calculator();
        calculator.div(33, 0);}
}
