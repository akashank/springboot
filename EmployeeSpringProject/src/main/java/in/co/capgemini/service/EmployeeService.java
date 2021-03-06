package in.co.capgemini.service;

import java.util.List;
import java.util.Optional;



public interface EmployeeService {
	
	public void addNewEmployee(Employee employee);
	public List<Employee> viewAllEmployee();
	public Optional<Employee> getID(int id);
	public void updateEmployee(int id, Employee employee);
	public void deleteEmp(int id);

}