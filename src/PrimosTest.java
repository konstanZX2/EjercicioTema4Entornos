import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {


    @BeforeEach
    void setUp() {


    }

    @Test
    void testGenerarPrimos5() {
        int max = 5;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {2,3,5};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }
    @Test
    void testGenerarPrimos0() {
        int max = 0;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }
    @Test
    void testGenerarPrimos1() {
        int max = 1;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }
    @Test
    void testGenerarPrimos2() {
        int max = 2;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {2};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }
    @Test
    void testGenerarPrimos3() {
        int max = 3;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {2,3};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }
    @Test
    void testGenerarPrimos100() {
        int max = 100;
        int [] numerosPrimos = Primos.generarPrimos(max);
        int [] numerosPrimosTest = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArrayEquals(numerosPrimosTest,numerosPrimos);
    }

}