package com.masai;

import java.lang.reflect.Method;
import java.util.ArrayList;

public interface Functional_Interface_That_Take_String_Return_Employee_Object {

Employee convert(String details);	
	
}


class Main6{
	
public static void main(String[] args) {

	
//Functional_Interface_That_Take_String_Return_Employee_Object method = (String details)->{
//
//String[] arr = details.split(",");
//
//Employee ep = new Employee();
//
//String name = arr[0];
//int age = Integer.parseInt(arr[1]);
//int id = Integer.parseInt(arr[2]);
//int slary = Integer.parseInt(arr[3]);
//
//ep.setName(name);
//ep.setAge(age);
//ep.setEmployeeId(id);
//ep.setSalary(slary);
//
//return ep;
//};
	
	
	
//MORE SIMPLY WAY
Functional_Interface_That_Take_String_Return_Employee_Object method = details ->{
	
String[] n = details.split(",");

Employee ep = new Employee(n[0], Integer.parseInt(n[1]), Integer.parseInt(n[2]), Integer.parseInt(n[3]));
	return ep;
};
	
ArrayList<Employee> list = new ArrayList<>();

Employee ep1 = method.convert("Vicky,24,10,10000");	
Employee ep2 = method.convert("Varun,26,3,20000");

list.add(ep1);
list.add(ep2);

String ep5 = "Karan,31,2,40000";
String ep6 = "Mahi,29,9,24000"; 

list.add(method.convert("Akash,37,5,23000"));
list.add(method.convert(ep5));
list.add(method.convert("Aman,28,8,12000"));
list.add(method.convert(ep6));
System.out.println(list);
	
	
	
	
	
}	
	
	
}