package restAPI.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import restAPI.repository.EmployeeRepository;
import restAPI.model.Employee;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    //CREATE
    public Employee createEmployee(Employee emp)
    {
      return empRepository.save(emp);
    }

    //READ
    public List<Employee> getEmployees()
    {
        return empRepository.findAll();
    }

    //DELETE
    public void deleteEmployee(Long id)
    {
         empRepository.deleteById(id);
    }

    //UPDATE
    public Employee updateEmployee(Long id, Employee newEmp)
    {
        Employee oldemp = empRepository.findById(id).get();
        oldemp.setFirstName(newEmp.getFirstName());
        oldemp.setLastName(newEmp.getLastName());
        oldemp.setEmailId(newEmp.getEmailId());
        return empRepository.save(oldemp);
    }
}
