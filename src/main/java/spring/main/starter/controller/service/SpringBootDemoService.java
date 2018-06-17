package spring.main.starter.controller.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.main.starter.controller.dto.Employee;

@Service
public class SpringBootDemoService {
	
	public List<Employee> empList=new ArrayList<>(Arrays.asList(new Employee(1, "emp1", "email1", "15/06/2015", "15/06/1993"),
												new Employee(2, "emp2", "email2", "15/06/2015", "15/06/1993"),
												new Employee(3, "emp3", "email3", "15/06/2015", "15/06/1993"),
												new Employee(4, "emp4", "email4", "15/06/2015", "15/06/1993")));
	public List<Employee> getEmpList() {
		return this.empList;
	}
	public List<Employee> getEmp(int id) {
		return empList.stream().filter(t -> t.getId()==id).collect(Collectors.toList());
	}
	public List<Employee> addEmp(Employee emp) {
		empList.add(emp);
		return empList;
	}
	public List<Employee> updateEmp(Employee emp,int id) {
		for (int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getId()==id) {
				empList.get(i).setDob(emp.getDob());
				empList.get(i).setDoj(emp.getDoj());
				empList.get(i).setEmail(emp.getEmail());
				empList.get(i).setName(emp.getName());
			}
		}
		return empList;
	}
	public List<Employee> deleteEmp(int id) {
		empList.removeIf( t -> t.getId()==id);
		return empList;
	}
}
