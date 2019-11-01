package mum.edu.controller;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.Validator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CalculatorController {
    @AutoWired
    Validator calculatorValidator;

    @RequestMapping(value = {"/Calculator"})
    public String inputCalculator() {
        return "/WEB-INF/calculator.jsp";
    }

    @RequestMapping(value = {"/SaveCalculator"})
    public String saveCalculator(Calculator calculator, HttpServletRequest request) {
        request.setAttribute("calculator", calculator);
        List<String> errors = calculatorValidator.validate(calculator);
        if (!errors.isEmpty()) {
            request.setAttribute("errors", errors);
            return "/WEB-INF/result.jsp";
        }
        calculator.calSum();
        calculator.calProduct();
        return "/WEB-INF/result.jsp";
    }

}
