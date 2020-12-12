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
    
}
