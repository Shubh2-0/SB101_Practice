package com.masai;

import java.util.ArrayList;
import java.util.function.Function;

/*

Function is a type of FUNCTIONAL INTERFACE which have only 
one method that is APPLY which return the RESPECTIVE DATA TYPE 
THAT USER WANT 

so in simple word we can can say that function interface 
is return the value according to the condition.

APPLY METHOD TAKING ONE PARAMETER


 */




public class Function_Interface {
	
	
	public static boolean CheckPrime(Integer num) {
	if(num==1) {
		return false;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0)
			return false;
	}
		
	return true;	
	}

	public static void main(String[] args) {
		
	Function<Integer,String> checkOdd = i -> i%2==0?"NUMBER IS EVEN" : "NUMBER IS ODD";
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(3);
	list.add(40);
	list.add(20);
	list.add(2839);
	list.add(40);
	list.add(21);
	list.add(420);
	list.add(5);
	list.add(311);
	list.add(21);
	list.add(8);
	list.add(5);
	list.add(130);
	list.add(0);
	
	list.forEach(i -> System.out.println(checkOdd.apply(i)));
	
	
//	USE METHOD REFRENCE
	Function<Integer, Boolean> checkP = Function_Interface::CheckPrime;
	
	list.forEach(i-> System.out.println(checkP.apply(i)));
	
	
// USE METHOD REFRENCE
	Function<String, Integer> convertintoNumber = Integer::parseInt;
	System.out.println(convertintoNumber.apply("1000"));
	
	
	
		
		
		
		
		
	}
	
	
	
	
}
