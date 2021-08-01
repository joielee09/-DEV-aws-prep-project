package hello.hellospring.repository;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {
    List<Map<String, Object>> getEmployee();
}
