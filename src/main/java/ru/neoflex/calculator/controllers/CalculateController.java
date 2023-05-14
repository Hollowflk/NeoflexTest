package ru.neoflex.calculator.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.neoflex.calculator.Model.VacationPay;
import ru.neoflex.calculator.service.CalculateService;

@Controller
@AllArgsConstructor
public class CalculateController {

    private final CalculateService service;

    @GetMapping("/calculate")
    public String calculate(@ModelAttribute("vacationpay") @Valid VacationPay vacationPay,
                            BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "calculate";
        }
        vacationPay.setVacationPay(service.calculate(vacationPay.getWage(), vacationPay.getDays()));
        return "calculate";
    }
}
