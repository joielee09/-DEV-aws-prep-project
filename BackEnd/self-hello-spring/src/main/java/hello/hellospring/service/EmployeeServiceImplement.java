package hello.hellospring.service;

import hello.hellospring.repository.EmployeeMapper;
import hello.hellospring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImplement implements EmployeeRepository {

    private EmployeeMapper employeeMapper;

    @Autowired
    EmployeeServiceImplement(EmployeeMapper employeeMapper){
        this.employeeMapper = employeeMapper;
    }

    public List<Map<String, Object>> getEmployee(){
        return employeeMapper.getEmployee();
    }
}
