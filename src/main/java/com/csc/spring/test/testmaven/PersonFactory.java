package com.csc.spring.test.testmaven;

public class PersonFactory {
public Person getPerson(){
	System.out.println("from factory method");
	return new Person(89, "eightynine");
}
}
