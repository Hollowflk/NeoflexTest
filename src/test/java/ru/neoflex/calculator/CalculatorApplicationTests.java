package ru.neoflex.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import ru.neoflex.calculator.service.CalculateService;

import java.math.BigDecimal;

import static org.springframework.test.util.AssertionErrors.*;

@SpringBootTest
class CalculatorApplicationTests {

    @Autowired
    private CalculateService service;

    @Test
    void testCalculate(){
        double wage = 30000;
        int days = 28;
        assertEquals("calculate", new BigDecimal("28669.20"), service.calculate(wage, days));
    }
}
