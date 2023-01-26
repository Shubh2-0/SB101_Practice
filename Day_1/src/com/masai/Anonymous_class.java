package com.masai;

public class Anonymous_class {

	
public static void main(String[] args) {
	

/*Anonymous class are that type of classes which provide the method
solution on interface within another class */ 
	
Normal_Interface A1 = new Normal_Interface() {
	
	@Override
	public void sayNamaste(String name) {
	 
	System.out.println("Namste "+name);	
		
	}
};	
	

A1.displayName("Shubham");
A1.sayNamaste("JAVA");

	
	
	
	
	
	
}	
	
	
	
	
}
