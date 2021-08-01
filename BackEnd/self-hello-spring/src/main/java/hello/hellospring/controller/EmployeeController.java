package hello.hellospring.controller;

import hello.hellospring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    @Autowired
    EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    @ResponseBody
    public List<Map<String, Object>> getEmployee(){
        return employeeRepository.getEmployee();
    }
}