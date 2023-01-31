package com.masai;

/* we can use method references in the place of LAMBDA EXPRESSION because its
provide more simplicity to write our code 
in the method references basically we use those method which
are already defined by any class.
instead write a logic or a code we can use predefined method 
if the return type and parameters are same as Functional interface method 
*/



/*

 FOR NON STATIC METHODS IT NECESSARY TO CREATE AN OBJECT. IF    
 WE WANT TO USE NON STATIC METHOD AS A REFERENCE FOR THE FUNCTIONAL 
 INTERFACE SO FIRST WE HAVE TO CREATE AN OBJECT AND REFFERED THE METHOD OF THAT OBJECT
 METHOD REFERENCE AND METHOD THAT WE REFFERED ARE ONLY BELONGS TO THAT OBJECT AND THAT CLASS ALSO:-
 
 INTERFACE_NAME  (ANY VARIABLE_NAME) = (OBJECT_NAME)::(METHOD_NAME) 
 
*/


class Student{

int id;
String name;
public Student(int id, String name) {
	this.id = id;
	this.name = name;
}

public void sayHello(Student st) {
	System.out.println("Hello "+st.name);
}

	
}

class Product{

int amount;
String name;
int quantity;



public Product(int amount, String string, int quantity) {
	super();
	this.amount = amount;
	this.name = string;
	this.quantity = quantity;
}



void showDetails(Product p) {

	System.out.println("Product name is "+p.name+"  \t "+"Product price is " + p.amount + "\t" +" Quantity is "+p.quantity);
	
}
	
	
}


@FunctionalInterface
interface Greeting{

public void greet(Student st);	
	
}

interface ProductPrinting{
	
public void print1(Product p);
	
}



public class Non_Static_Method_Refrence {


	
public static void main(String[] args) {

	
	Student st1 = new Student(23, "Pankaj");
	Student st2 = new Student(7, "Uday");
	Greeting m1 = st1::sayHello;
	m1.greet(st2);
	m1.greet(st1);
	
	Product p1 = new Product(50, "Pencil", 10);
	Product p2 = new Product(1000, "School-Bag", 1);
	ProductPrinting m2 = p1::showDetails;
	m2.print1(p1);
	m2.print1(p2);
	
	
	
	
	
	
	
}
	





	
	
	
	
	
	
	
	
}
