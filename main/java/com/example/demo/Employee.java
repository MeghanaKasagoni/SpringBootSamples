package com.example.demo;

public class Employee {

	private Long id;
	private String name;
	private String mobileno;
	private Long salary;
	
	public Employee() { }
	
	public Employee (Long id,String name,String mobileno, Long salary) {
		this.id=id;
		this.name=name;
		this.mobileno=mobileno;
		this.salary=salary;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary=salary;
	}
	
	public String getMobileno() {
		return mobileno;
	}
 }
