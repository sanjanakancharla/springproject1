package restAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import restAPI.service.EmployeeService;
import restAPI.model.Employee;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //CREATE OPERATION/POST API
    @RequestMapping(value="/employees",method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp)
    {
        return employeeService.createEmployee(emp);
    }

    //GET OPERATION/FETCH DETAILS FROM DB
    @RequestMapping(value="/employees",method = RequestMethod.GET)
    public List<Employee> fetchEmployees()
    {
        return employeeService.getEmployees();
    }

    //DELETE
    @RequestMapping(value="/employee/{empid}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable(value="empid") Long id){
         employeeService.deleteEmployee(id);
    }

    //PUT
    @RequestMapping(value = "/employee{empid}", method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable(value="empid") Long id, @RequestBody Employee emp)
    {
        return employeeService.updateEmployee(id, emp);
    }

}
