import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(9, calculator.addNumbers(4,5));
    }

    @Test
    public void canSubtract(){
        assertEquals(15, calculator.subtractNumbers(20, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(20, calculator.multiplyNumbers(4, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(0.8, calculator.divideNumbers(4,5), 0.0);
    }

}
