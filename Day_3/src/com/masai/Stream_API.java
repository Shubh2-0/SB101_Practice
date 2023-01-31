package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 
 Stream API is a kind of interface in which they 
 provide a several methods to reduce our 
 code length. it is also performing 
 the operations on non-primitive object without changing the 
 existing(BASIC) structure.
 
 in simple word we can say that stream API is very
 useful to performing  several operations
 on non-primitive type without disturbing their structure 
 
 By stream API we can do operation in more 
 precise way on collections objects
 we can use stream on our normal arrays also

 
 */





public class Stream_API {

public static void main(String[] args) {
	
List<Integer> numbers = new ArrayList<>();
numbers.add(2);
numbers.add(6);
numbers.add(10);
numbers.add(29);
numbers.add(74);
numbers.add(21);
numbers.add(22);
numbers.add(5);
numbers.add(3);
numbers.add(2);
numbers.add(3);
numbers.add(3);
numbers.add(3);
	
//NOW FILTER THOSE ELEMENTS WHO IS GREATER THAN 10
List<Integer> numbers2 = numbers.stream().filter(i -> i > 10).collect(Collectors.toList());
System.out.println(numbers2);

//NOW CREATE A LIST IN WHICH ALL THE ELEMENTS STORE FROM NUMBERS BUT ELEMENTS SHOULD CONVERTED INTO THIER SQUARE
List<Integer> numbers3 = numbers.stream().map(i1->i1*i1).collect(Collectors.toList());
System.out.println(numbers3);

//CREATE A LIST OF STRING AND AFTER ANOTHER LIST WHICH STORING ELEMENTS FROM PREVIOUS BUT ELEMENST HAVE LENGTH MORE TAHN 5
List<String> names = Arrays.asList(new String[] {"Shubham","Mahi","Pankaj","Mahendra","Ayush","Zen","Om"} );
List<String> names2 = names.stream().filter(i->i.length()>5).collect(Collectors.toList());
System.out.println(names2);

//FIND MAX AND MIN FROM NUMBERS OBJECT
Optional<Integer> max = numbers.stream().max(Comparator.comparing(Integer::intValue));
System.out.println(max.get());
Optional<Integer> min = numbers.stream().min(Comparator.comparing(Integer::intValue));
System.out.println(min.get());

//PRINT DISTINCT ELEMENTS FROM NUMBERS OBJECT
List<Integer> dis = numbers.stream().distinct().collect(Collectors.toList());
System.out.println(dis);



	
}	
	
}
