package com.masai;

import java.util.ArrayList;
import java.util.function.Consumer;

/*

Consumer is a type of FUNCTIONAL INTERFACE which have only 
one method that is Accept which return type is VOID 
so it's only accept and performing the operations 
if we want but return nothing
in other way we can say that consumer interface
consume something but not return anything

ACCEPT METHOD TAKING ONE PARAMETER 

 
*/







public class Consumer_Interface {

	
	public static void anwser(Integer i) {
	
		if(i%2==0) System.out.println("Number is Even");
		
		else System.out.println("Number is Odd");
			
		
	}

	
	public static void main(String[] args) {
	
		
		
	Consumer<Integer> doubleAmout = e -> System.out.println(e*e);
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(3);
	list.add(5);
	list.add(20);
	list.add(4);
	list.add(7);
	list.add(8);
	list.add(2);
	list.add(1);
	list.add(60);
	list.add(10);
	list.add(9);
	list.add(6);
	
	list.forEach(e -> System.out.println(e));
    
	System.out.println("\nAFTER SQURING ALL THE ELEMENTS OF LIST\n");
	
	list.forEach(e -> doubleAmout.accept(e));
	
	
//	USING <ETHOD REFERENCE
	Consumer<Integer> printAnswer = Consumer_Interface::anwser;
	
	System.out.println("\nUSING METHOD REFERENCE\n");
	
	list.forEach(i -> printAnswer.accept(i));
	
	
		
		
	}
	
}
