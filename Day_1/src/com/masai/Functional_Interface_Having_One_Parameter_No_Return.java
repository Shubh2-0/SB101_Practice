package com.masai;

public interface Functional_Interface_Having_One_Parameter_No_Return {

void hello(String n);
	

}
 
//##########################################################

class main3{
	
public static void main(String[] args) {
	

//Functional_Interface_Having_One_Perameter_No_Return f1 = (n)->{
//	System.out.println("Hello "+n);
//};

	
//MUCH SIMPLY WAY
Functional_Interface_Having_One_Parameter_No_Return f1 = n -> System.out.println("Hello "+n);	

f1.hello("Masai");


}	
	
}