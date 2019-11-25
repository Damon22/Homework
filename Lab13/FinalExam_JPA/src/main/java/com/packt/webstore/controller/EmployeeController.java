package com.packt.webstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.packt.webstore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping({"/employees"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = {"", "/list"})
    public ModelAndView listEmployees(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employees", employeeService.getAllEmployees());
        modelAndView.setViewName("employees");
        return modelAndView;
    }

    @RequestMapping("/employee")
    public String getEmployeeByNumber(Model model, @RequestParam("id") int employeeId) {
		List<Employee> employees = new ArrayList<>();
        employees.add(employeeService.findEmployeeByEmployeeNumber(employeeId));
        model.addAttribute("employee", employees);
        return "employee";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
        return "addEmployee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employeeToBeAdded) {
        employeeService.addEmployee(employeeToBeAdded);
        return "redirect:/employees/list";
    }

}




































