package ru.neoflex.calculator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculateService {
    private final double AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH = 29.3;
    public BigDecimal calculate(double wage, int days) {
        return new BigDecimal(wage).divide( new BigDecimal(AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH),2,RoundingMode.UP)
                .multiply(new BigDecimal(days));
    }
}
