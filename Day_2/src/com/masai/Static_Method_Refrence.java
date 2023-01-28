package com.masai;

import java.util.ArrayList;

/* we can use method references in the place of LAMBDA EXPRESSION because its
 provide more simplicity to write our code 
 in the method references basically we use those method which
 are already denied by any class.
 instead write a logic or a code we can use predefined method 
 if the return type and parameters are same as Functional interface method 
 */



/*
 
  FOR STATIC METHODS WE DON'T NEED TO CREATE A OBJECTS WE CAN DIRECTLY 
  USE AND REFFRED THE STATIC METHOD FOR FUNCTIONAL INTERFACES METHOD
  
  METHOD REFERENCE :-
  
  INTERFACE_NAME  (ANY VARIABLE_NAME) = (CLASS_NAME)::(METHOD_NAME) 
  
 */



@FunctionalInterface
interface UsingStaticMethod1{
public void print(String str);
}

@FunctionalInterface
interface UsingStaticMethod2{
public int stringToNum(String num); 	
}

@FunctionalInterface
interface UsingStaticMethod3{
public ArrayList<Integer> fromto(int start,int end);		
}

@FunctionalInterface
interface UsingStaticMethod4{
void check(int h);	
}


public class Static_Method_Refrence {

static void sayHello(String s) {
	System.out.println("Hello "+s);
}

static ArrayList<Integer> give(int s,int e){
ArrayList<Integer> arr = new ArrayList<>();
for(int i=s;i<=e;i++) {
	arr.add(i);
}
	
return arr;
}


static void validAge(int num) {

if (num < 18)
System.out.println("You are not eligible for the course");
else
System.out.println("You are eligible for the course");	
	

}




	
	
public static void main(String[] args) {

	UsingStaticMethod1 f1 = Static_Method_Refrence::sayHello;
	f1.print("Shubham");
	
	
	UsingStaticMethod2 f2 = Integer::parseInt;
	System.out.println(f2.stringToNum("34"));
	
	UsingStaticMethod3 f3 = Static_Method_Refrence::give;
	System.out.println(f3.fromto(5, 23));
	
	UsingStaticMethod4 f4 = Static_Method_Refrence::validAge;
	f4.check(3);
	
	
	
}	
	
	
	
	
	
}

