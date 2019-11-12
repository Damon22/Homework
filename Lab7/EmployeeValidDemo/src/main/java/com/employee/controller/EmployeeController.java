package com.employee.controller;

import com.employee.domain.Employee;
import com.employee.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
public class EmployeeController {
    @Autowired
    ServletContext servletContext;

    @RequestMapping(value="/registration",method= RequestMethod.GET)
    public String showForm(@ModelAttribute("employee") Employee employee, Model model){

        return "registration";
    }

    @RequestMapping(value="/registration",method=RequestMethod.POST)
    public String processForm(@ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        MultipartFile multipartFile = employee.getProfileImage();
        if (multipartFile != null || !multipartFile.isEmpty()) {
            String fileName = servletContext.getRealPath("/") + "resources\\images\\" + multipartFile.getOriginalFilename();
            try {
                multipartFile.transferTo(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
                throw new NotFoundException("Page Not Found");
            }
        }
        redirectAttributes.addFlashAttribute("employee", employee);
        return "redirect:/userDetail";
    }

    @GetMapping("/userDetail")
    public String success() {
        return "success";
    }
}
