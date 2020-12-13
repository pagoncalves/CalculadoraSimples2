package memCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patricia
 */
public class CalcTest {

    public CalcTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSoma() {
        System.out.println("soma");
        Calc calc = new Calc();
        calc.setDisplay(11.5);
        calc.soma(12.0);
        double soma = calc.getDisplay();
        assertEquals(23.5, soma, 0.0);
    }

    public void testSubt() {
        System.out.println("subtração");
        Calc calc = new Calc();
        calc.setDisplay(11.5);
        calc.subt(12.0);
        double subt = calc.getDisplay();
        assertEquals(-0.5, subt, 0.0);
    }

    public void testMult() {
        System.out.println("multiplicação");
        Calc calc = new Calc();
        calc.setDisplay(11.5);
        calc.mult(12.0);
        double mult = calc.getDisplay();
        assertEquals(138.0, mult, 0.0);
    }

    public void testDivi() {
        System.out.println("divisão");
        Calc calc = new Calc();
        calc.setDisplay(11.5);
        calc.divi(12.0);
        double divi = calc.getDisplay();
        assertEquals(0.96, divi, 0.1);
    }

    public void testTot() {
        System.out.println("operações");
        Calc calc = new Calc();
        calc.setDisplay(10.0);
        calc.soma(12.0);
        calc.subt(5.5);
        calc.mult(15.0);
        calc.divi(2.0);
        double tot = calc.getDisplay();
        assertEquals(123.75, tot, 0.1);
    }
}
