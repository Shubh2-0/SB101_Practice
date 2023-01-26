package com.masai;

public interface Interface_Having_Two_Parameter_No_Return {

void add(int a,int b);	
	
}


class Main4{
	
	
public static void main(String[] args) {

	
//Interface_Having_Two_Parameter_No_Return f1 = (int a, int b)->{
//	
//	System.out.println(a+b);
//};
	
//MORE SIMPLY WAY	
Interface_Having_Two_Parameter_No_Return f1 = (a,b) -> System.out.println(a+b);	
	
f1.add(3, 9);

	
}	
	
	
	
}