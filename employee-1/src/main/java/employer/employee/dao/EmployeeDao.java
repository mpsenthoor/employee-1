package employer.employee.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import employer.employee.model.Employee;
import employer.employee.repository.EmployeeRepository;

@Service
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> addEmployee(Employee emp){
		
		empRepo.save(emp);
		
		List<Employee> liemp = new ArrayList<Employee>();
		
		liemp = empRepo.findAll();
		
		return liemp;
	}
	
	public List<Employee> listOfEmployee(){
		List<Employee> liemp = new ArrayList<Employee>();
		
		liemp = empRepo.findAll();
		
		return liemp;
	}
	
	public List<Employee> updateEmployee(Employee empObj){
		
		Employee employee = new Employee();
		
		employee = empRepo.getById(empObj.getId());
		
		employee.setName(empObj.getName());
		employee.setSalary(empObj.getSalary());
		
		empRepo.save(employee);
		
		List<Employee> liemp = new ArrayList<Employee>();
		
		liemp = empRepo.findAll();
		
		return liemp;
	}
	
	

}
