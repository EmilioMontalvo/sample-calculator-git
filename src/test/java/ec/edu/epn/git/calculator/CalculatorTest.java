package ec.edu.epn.git.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c=null;

    @Before//para conexiones a bases de datos
    public void setUpClass(){

        System.out.println("setUpClass()");

    }

    @Before//antes de cada metodo/test
    public void setUp(){
        c=new Calculator();
        System.out.println("setUp()");

    }
    @Test
    public void given_two_integers_when_addition_then_ok(){

        assertEquals(6, c.addition(4,2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(2, c.subtraction(4,2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok(){
        assertEquals(3, c.division(6,0));
    }

    @Test(timeout = 50)
    public void given_two_integers_when_multiplication_then_ok(){
        assertEquals(8, c.multiplication(4,2));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
    }

    @AfterClass//para conexiones a bases de datos
    public static void tearDownClass(){

        System.out.println("tearDownClass()");

    }
}