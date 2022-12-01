import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calc = new Calculator();
    @Test
    void additional(){
        assertEquals(2, calc.add(1,1));

    }
    @Test
    void multiplication (){
        assertEquals(6,calc.multi(3,2));
    }

    @Test
    void division (){
        assertEquals(4, calc.div(8,2));
    }

    @Test
    void subtraction (){
        assertEquals(5,calc.sub(9,4));
    }

}
