package com.masai;

public interface Normal_Interface {


/*
 An interface is a building block of class we can say that
 we can not create object using interface but we can use reference variable 
 using interface name for creating their implementation class(Concrete class) objects
 1.A interface can have n number of method 
 2.A interface can have n number of static method
 3.A interface can have n number of final variable    
 2.A interface can have n number of default method
 2.A interface can have n number of private method(CAN'T ACCESS IN THEIR IMPLEMENTED CLASS)	
 */
	
	
//ABSTRACT METHOD	
public void sayNamaste(String name);

//DEFAULT METHOD
public default void displayName(String name) { 
	System.out.println(name);
}


//STATIC METHOD
public static void showAge(int age) {
   System.out.println(age);	
}
	
	
	
}

//#########################################################################


class Implementation_of_Normal_Interface implements Normal_Interface{

/*class implementation of interface in which we have to defined the functionalities of 
	all the abstract method that interface have.
	*/
	
	
	@Override
	public void sayNamaste(String name) {
	  
		System.out.println("Namaste "+name);
		
	}
	
	
}


//#########################################################################

class Main1 {

	
public static void main(String[] args) {
	
	
Implementation_of_Normal_Interface obj1 = new Implementation_of_Normal_Interface();

obj1.sayNamaste("Shubham");
obj1.displayName("Masai School");


Normal_Interface obj2 = new Implementation_of_Normal_Interface();
obj2.sayNamaste("Aman");
obj2.displayName("SB101");

//We can use static method using interface name
Normal_Interface.showAge(20);	
	



	
	
}	
	
}














