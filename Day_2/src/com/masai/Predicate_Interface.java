package com.masai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;



/*
 
 Predicate is a type of FUNCTIONAL INTERFACE which have only 
 one method that is TEST which return BOOLEAN value according 
 to given condition into this method
 TEST METHOD TAKING ONE PARAMETER ONLY
 
 */


class Student1{

String name;
int marks;
String status;

public Student1(String name,int marks) {

	this.marks = marks;
	this.name = name;
	status = "Waiting For Declaration";
}

@Override
public String toString() {
	return "\tName: " + name + "\tMarks: " + marks + "\tStatus: " + status + "\n";
}

	





}



public class Predicate_Interface {

	public static boolean checking(int num) {
	
		return num%2==1;
		
	}
	
	public static boolean checkPime(int h) {
	if(h==1) {
		return false;
	}
	for(int i=2;i<h;i++) {
	if(h%i==0)
		return false;
		
	}
		
	return true;
	}
	

public static void main(String[] args) {

/* USING LONG FORMAT	
Predicate<Integer> checkOdd = (Integer e)->{

if(e%2==1) {
	return true;
}else {
	return false;
}
	
};*/
	

	
	
//USING VERY SHORT FORMAT (RECOMMENDED	
Predicate<Integer> m1 = e -> e%2==1;	

//USING METHOD REFRENCE
Predicate<Integer> m2 = Predicate_Interface::checking;
	
//System.out.println(m1.test(34));
//System.out.println(m2.test(3));
	


Predicate<Student1> m3 = t ->{
if(t.marks > 31) {
	t.status = "Pass";
	return true;
}else {
	t.status = "Fail";
	return false;
}
	
};

ArrayList<Student1> list1 = new ArrayList<>();
list1.add(new Student1("Aman", 24));
list1.add(new Student1("Pankaj", 30));
list1.add(new Student1("Shiv", 40));
list1.add(new Student1("Ram", 70));
list1.add(new Student1("Dev", 50));
list1.add(new Student1("Boby", 40));





System.out.println("\t    BEFORE USE PREDICATE\n");
System.out.println(list1);

System.out.println("\t     AFTER USING PREDICATE\n");
list1.forEach(e -> m3.test(e));
System.out.println(list1);


ArrayList<Integer> list2 = new ArrayList<>();

Predicate<Integer> checkPrime = Predicate_Interface::checkPime;

for(int i=40;i<80;i++) {

if(checkPrime.test(i))
list2.add(i);	
	
}

System.out.println(list2);


	
	
}


	

	

}
