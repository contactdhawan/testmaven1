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
public void setStreet(String street) {
this.street = street;
}
public String getZipcode() {
return zipcode;
}
public void setZipcode(String zipcode) {
	if(true){
		
	}
	if(zipcode=="123"){zipcode="120";}
this.zipcode = zipcode;
}

public void init(){
	System.out.println("default init");
}
public void destroy(){
	System.out.println("default destroy");
}

}