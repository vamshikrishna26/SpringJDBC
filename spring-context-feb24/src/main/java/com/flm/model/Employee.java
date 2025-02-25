package com.flm.model;

public class Employee {
	private Long id;
	private String name;
	private String address;
	private Double salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(Long id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address= address;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addresss=" + address + ", salary=" + salary + "]";
	}
	
	public Employee(Employee emp) {
		this.id = emp.getId();
		this.name =emp.getName();
		this.address= emp.getAddress();
		this.salary = emp.getSalary();
	}
	}