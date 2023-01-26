package com.masai;

@FunctionalInterface
public interface Functional_Interface_Method_Having_Zero_Parameter_No_Return {

/*
 An Functional Interface only have one abstract method
 but n number of default method , variable(Final) , static   
  	
 */
	
void Show();	

static void hello(String name) {
	System.out.println("Hello "+name);
}

public default void sayHi(String n) {
	System.out.println("Hi "+n);
}


// A VALID FUNCTIONAL INTERFACE

}

//###############################################################


class Main{

	
public static void main(String[] args) {
	

//LAMBDA EXPRESSION
//Functional_Interface f1 = ()->{
//	System.out.println("Inside Implementation of Lambda Expression");
//};
//

	
	
//IN MUCH EASIER  WAY
//IF WE HAVE ONLY ONE STATEMENT IN THE METHOD WE CAN AVOID {} CURLY BRACES
Functional_Interface_Method_Having_Zero_Parameter_No_Return f1 = () -> System.out.println("Inside Implementation of Lambda Expression");

f1.sayHi("Shubham");
f1.Show();
	
	
	
}	
	
	
}
