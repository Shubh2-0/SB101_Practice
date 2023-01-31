package com.masai;

/*

FOR CONSTRUCTOR IT NECESSARY TO CREATE AN OBJECT.HERE WE ARE USING NEW KEYWORD
BECAUSE CONSTRUCTOR IS CALLED WHEN WE CREATED A OBJECT AND 
BY NEW KEYWORD WE CREATE AN OBJECT
CONSTRUCTOR IS NOT RETURN ANYTHING SO OUR FUNCTIONAL INTERFACE 
METHOD SHOULD NOT RETURN ANYTHING ALSO

INTERFACE_NAME  (ANY VARIABLE_NAME) = (CLASS_NAME)::NEW

*/


class Employee{

int salary;
String name;
public Employee(int salary, String name) {

	this.salary = salary;
	this.name = name;
}
public Employee(Employee s) {
	System.out.println(s.salary);
}


	
}

interface Salary{

public void getSalary(Employee s);	
	
}




public class Constructor_Method_Refrence {
	
public static void main(String[] args) {

Employee emp1 = new Employee(40000, "Shivansh");	
Employee emp2 = new Employee(20000,"Aman");	
Salary m1 = Employee::new;
	
m1.getSalary(emp1);
m1.getSalary(emp2);

}	
	

}
