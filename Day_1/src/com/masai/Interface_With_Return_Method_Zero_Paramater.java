package com.masai;

@FunctionalInterface
public interface Interface_With_Return_Method_Zero_Paramater {
int displayNumber();
	
	default void sayHello(String n) {
		System.out.println("Hello "+n);
	}

}

//############################################################################

class Main2{

	
public static void main(String[] args) {
	
Interface_With_Return_Method_Zero_Paramater f1 = () -> 34;

System.out.println(f1.displayNumber());
	
	
	
}
	
	
	
}