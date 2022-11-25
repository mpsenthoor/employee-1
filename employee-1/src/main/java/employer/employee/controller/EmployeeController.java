package employer.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employer.employee.dao.EmployeeDao;
import employer.employee.model.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;

	@GetMapping("/List")
	public List<Employee> getEmployeeList(){
		return empDao.listOfEmployee();
	}
	
	@PostMapping("/Add")
	public List<Employee> addEmployee(@RequestBody Employee emp){
		
		return empDao.addEmployee(emp);
	}
	
	@PostMapping("/Update")
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		
		return empDao.addEmployee(emp);
	}
}
