package com.effectivejava3rd.ex1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void 더하기() {
        int res = Calculator.calc("10 + 20");

        assertEquals(30, res);
    }

    @Test
    void 더하기_2() {
        int res = Calculator.calc("20 + 20");

        assertEquals(40, res);
    }

    @Test
    void 더하기_3() {
        int res = Calculator.calc("10 + 10");

        assertEquals(20, res);
    }

    @Test
    void 빼기() {
        int res = Calculator.calc("10 - 10");

        assertEquals(0, res);
    }

    @Test
    void 곱하기() {
        int res = Calculator.calc("10 * 10");

        assertEquals(100, res);
    }
}
