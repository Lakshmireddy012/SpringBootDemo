package spring.main.starter.controller.dto;

public class Employee {
	int id;
	String name,email,doj, dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee() {
		
	}
	public Employee(int id, String name, String email, String doj, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.doj = doj;
		this.dob = dob;
	}
	
}
