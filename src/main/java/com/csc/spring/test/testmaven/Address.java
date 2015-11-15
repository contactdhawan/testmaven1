package com.csc.spring.test.testmaven;

public class Address {
String street;
String zipcode;
@Override
public String toString() {
	return "Address [street=" + street + ", zipcode=" + zipcode + "]";
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public void init(){
	System.out.println("default init");
}
public void destroy(){
	System.out.println("default destroy");
}

}
