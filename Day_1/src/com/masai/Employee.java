package com.masai;

public class Employee {

private String name;
private int age;
private int EmployeeId;
private int salary;






public Employee(String name, int age, int employeeId, int salary) {
	this.name = name;
	this.age = age;
	EmployeeId = employeeId;
	this.salary = salary;
}



public Employee() {

}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "\tName:" + name + "\tAge:" + age + "\tEmployeeId:" + EmployeeId + "\tSalary:" + salary + "\n";
}



	
}
