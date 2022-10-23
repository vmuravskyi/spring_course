package com.muravskyi.rest.client;

import com.muravskyi.rest.client.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    private String BASE_URL = "http://localhost:8080/spring_rest/api";
    private String EMPLOYEES_ENDPOINT = BASE_URL + "/employees";
    private String EMPLOYEE_ENDPOINT = BASE_URL + "/employees/{id}";

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> response = restTemplate.exchange(
                EMPLOYEES_ENDPOINT,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {
                }
        );
        return response.getBody();
    }

    public Employee getEmployee(int id) {
        return restTemplate.getForObject(EMPLOYEE_ENDPOINT, Employee.class, Map.of("id", id));
    }

    public Employee saveOrUpdateEmployee(Employee employee) {
        if (employee.getId() == 0) {
            ResponseEntity<Employee> responseEntity = restTemplate.postForEntity(
                    EMPLOYEES_ENDPOINT,
                    employee,
                    Employee.class
            );
            return responseEntity.getBody();
        }
        restTemplate.put(
                EMPLOYEE_ENDPOINT,
                employee,
                Map.of("id", employee.getId())
        );
        return employee;
    }

    public String deleteEmployee(int id) {
        ResponseEntity<String> response = restTemplate.exchange(
                EMPLOYEE_ENDPOINT,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<String>() {
                },
                Map.of("id", id)
        );
        return response.getBody();
    }

}
