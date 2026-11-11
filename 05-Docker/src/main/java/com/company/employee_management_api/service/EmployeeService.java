package com.company.employee_management_api.service;

import com.company.employee_management_api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

   private final List<Employee> employees =  new ArrayList<>();

   public EmployeeService() {
       employees.add(new Employee(
               1L,
               "Kasun",
               "kasun@gmail.com",
               "DevOps Engineer"
       ));

       employees.add(new Employee(
               2L,
               "Nimal",
               "nimal@gmail.com",
               "Software Engineer"
       ));


   }

   //all employees
   public List<Employee> getAllEmployees() {
       return employees;
   }

   //new employee
    public Employee addEmployee(Employee employee) {
       employee.setId((long) employees.size() +1);
       employees.add(employee);
       return employee;
    }

    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Update an existing employee
    public Employee updateEmployee(Long id, Employee updatedEmployee) {

        Employee existingEmployee = getEmployeeById(id);

        if (existingEmployee == null) {
            return null;
        }

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setEmail(updatedEmployee.getEmail());
        existingEmployee.setPosition(updatedEmployee.getPosition());

        return existingEmployee;
    }

    // Delete an employee
    public boolean deleteEmployee(Long id) {

        Employee employee = getEmployeeById(id);

        if (employee == null) {
            return false;
        }

        employees.remove(employee);
        return true;
    }
}
