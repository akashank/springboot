package in.co.capgemini;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.capgemini.employee.Employee;
import in.co.capgemini.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/employee")
	public ArrayList<Employee> viewAllEmployee()
	{
		return service.viewAllEmployee();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getID(@PathVariable int id)
	{
		return service.getID(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public void addNewEmployee(@RequestBody Employee employee)
	{
		service.addNewEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee)
	{
		service.updateEmployee(id, employee);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public void deleteEmp(@PathVariable int id)
	{
		service.deleteEmp(id);
	}

}
