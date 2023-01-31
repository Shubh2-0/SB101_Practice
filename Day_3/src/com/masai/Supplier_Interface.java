package com.masai;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

/*

Supplier is a type of FUNCTIONAL INTERFACE which have only 
one method that is GET which return the RESPECTIVE DATA TYPE 
THAT USER WANT 

so in simple word we can can say that 
supplier interface supply a value to the
user only

GET METHOD TAKING ZERO PARAMETER

 
*/



public class Supplier_Interface {

	
public static DayOfWeek giveWeek() {
	

	return DayOfWeek.SUNDAY;
	
}
	
	
	
public static void main(String[] args) {


Supplier<LocalDate> present = () -> LocalDate.now();
System.out.println(present.get());

//USE METHOD REFENCE
Supplier<DayOfWeek> sunday = Supplier_Interface::giveWeek;
System.out.println(sunday.get());


	
	
}	
	
}
