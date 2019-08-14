package junit;


import org.junit.Test;

public class DivisionCalculationByZero extends BaseTest {
    @Test
    public void testGetDevidedByNullException() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        calculator.div(33, 0);}
}
