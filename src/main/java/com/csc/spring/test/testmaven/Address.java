package com.csc.spring.test.testmaven;

public class Address {
private String street;
private String zipcode;
@Override
public String toString() {
return "Address [street=" + street + ", zipcode=" + zipcode + "]";
}
public String getStreet() {
return street;
}
public void setStreet(String value) {
this.street = value;
}
public String getZipcode() {
return zipcode;
}
public void setZipcode(String value) {
this.zipcode = value;
}

public void init(){
	System.out.println("default init");
}
public void destroy(){
	System.out.println("default destroy");
}

}