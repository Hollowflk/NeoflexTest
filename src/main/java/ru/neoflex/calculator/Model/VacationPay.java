package ru.neoflex.calculator.Model;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacationPay {

    @Min(value = 0, message = "Salary must be greater than zero")
    private double wage;
    @Min(value = 0, message = "Vacation days must be greater than zero")
    private int days;
    private BigDecimal vacationPay;
}
