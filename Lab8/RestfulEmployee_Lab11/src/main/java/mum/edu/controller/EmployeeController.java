package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import mum.edu.domain.Employee;


@Controller
public class EmployeeController {

    @RequestMapping("/")
    public String home() {
        return "employee";
    }

    @Autowired

    Validator validator;

    @RequestMapping("/addEmployee")
    public @ResponseBody Employee addEmployee(@Valid @RequestBody Employee employee) {
        System.out.println("Employee.name:" + employee.getFirstName());
        return employee;
    }
	
}
