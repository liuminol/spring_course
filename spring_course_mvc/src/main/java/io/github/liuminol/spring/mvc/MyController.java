package io.github.liuminol.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        Employee emp = new Employee();
        emp.setName("Ivan");
        emp.setSurname("Petrov");
        emp.setSalary(500);

        model.addAttribute("employee", emp);

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute ("employee") Employee emp, BindingResult bindingResult) {
//        String name = emp.getName();
//
//        emp.setName("Mr. " + name);
//        emp.setSalary(emp.getSalary() * 2);

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }
        return "show-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }
}
