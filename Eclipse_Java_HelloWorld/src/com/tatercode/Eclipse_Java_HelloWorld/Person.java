package com.tatercode.Eclipse_Java_HelloWorld;

public class Person {
	// fields
	private String name; // name of person
	private int maximumBooks; // max books to checkout
	
	// constructor
	public Person(){
		name = "unknown name";
		maximumBooks = 3;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}
}
