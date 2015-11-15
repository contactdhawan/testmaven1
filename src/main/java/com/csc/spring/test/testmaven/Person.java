package com.csc.spring.test.testmaven;

public class Person {

	private int id;
	private String name;
	private String taxId;
	private Address add1;
	
	public static Person getInstance(int id,String name){
		System.out.println("creating person instance...");
		return new Person(007,"Neeraj");
	}
	
	public void init(){
		System.out.println("default init person");
	}
	public void destroy(){
		System.out.println("default destroy person");
	}
	public Address getAdd1() {
		return add1;
	}

public void onCreate(){
	System.out.println("on create...");
	
}
public void onDestroy(){
	System.out.println("on Destroy...");
	
}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}


	public String getTaxId() {
		return taxId;
	}


	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}


	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", add=" + add1 + "]";
	}


	public String showName(){
		return "My name is Spring"; 
	}
}