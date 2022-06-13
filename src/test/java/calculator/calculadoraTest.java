package calculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class calculadoraTest {
    Calculadora c = null;
    @Before
    public void setUP(){
        c = new Calculadora();

    }
    @Test
    public void given_two_integers_when_sumation_then_ok(){

        assertEquals(6, c.addition(4,2));
    }
    @Test
    public void given_two_integers_when_substraction_then_ok(){

        assertEquals(6, c.subtraction(8,2));
    }
    @Test
    public void given_two_integers_when_divition_then_ok(){

        assertEquals(4, c.divition(8,2));
    }
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_divition_then_exception(){
        assertEquals(4, c.divition(2,0));
    }

    @Test
    public void given_two_integers_when_multiplicattion_then_ok(){

        assertEquals(4, c.multiplication(2,2));
    }
}



