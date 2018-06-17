package spring.main.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.main.starter.controller.dto.Employee;
import spring.main.starter.controller.service.SpringBootDemoService;

@RestController
public class SpringBootDemoController {
	
	@Autowired
	private SpringBootDemoService sbdService;
	
	@RequestMapping("/emplist")
	public List<Employee> getEmpList() {
		return sbdService.getEmpList();
	}
	
	@RequestMapping("/emplist/{id}")
	public List<Employee> getEmp(@PathVariable int id) {
		return sbdService.getEmp(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/emplist")
	public List<Employee> addEmp(@RequestBody Employee emp) {
		return sbdService.addEmp(emp);
	}
	@RequestMapping(method=RequestMethod.PUT , value="/emplist/{id}")
	public List<Employee> updateEmp(@RequestBody Employee emp, @PathVariable int id) {
		return sbdService.updateEmp(emp,id);
	}
	@RequestMapping(method=RequestMethod.DELETE , value="/emplist/{id}")
	public List<Employee> deleteEmp(@PathVariable int id) {
		return sbdService.deleteEmp(id);
	}
}
