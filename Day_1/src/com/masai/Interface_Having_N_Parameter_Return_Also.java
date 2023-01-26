package com.masai;

public interface Interface_Having_N_Parameter_Return_Also {

int addNumbers(int a, int b, int c, int d);	
	
}

class Main5{

public static void main(String[] args) {

	
Interface_Having_N_Parameter_Return_Also f1 = (int a, int b, int c, int d )->{	
	return a+b+c+d;
};
	
System.out.println(f1.addNumbers(3,4, 6, 7));


	
	
}	
	
}