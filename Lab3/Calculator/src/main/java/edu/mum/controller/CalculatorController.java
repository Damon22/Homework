package edu.mum.controller;

import edu.mum.domain.Calculator;
import edu.mum.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CalculatorController {

    @Autowired
    Validator calculatorValidator;

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/calculator")
    public String inputCalculator() {
//        return "/WEB-INF/jsp/calculator.jsp";
        return "calculator";
    }

    @RequestMapping(value = {"/saveCalculator"}, method = RequestMethod.POST)
    public String saveCalculator(Calculator calculator, Model model) {
        List<String> errors = calculatorValidator.validate(calculator);
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "result";
        }
        calculator.calSum();
        calculator.calProduct();
        return "result";
    }
}
