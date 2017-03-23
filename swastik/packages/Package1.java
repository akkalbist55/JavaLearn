package com.swastik;

public abstract class Package1 {
	private int age;
	private String name;

	public Package1(String name, int age){
		this.age = age;
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}
}