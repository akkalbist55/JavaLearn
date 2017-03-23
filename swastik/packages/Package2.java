package com.swastik;

import com.swastik.subpackage.SubPackage;

public class Package2 extends Package1{

	public Package2(String name, int age){
		super(name, age);
	}

	public static void main(String[] args){

		Package2 obj = new Package2(args[0], Integer.parseInt(args[1]));

		SubPackage objSubPackage = new SubPackage();

		System.out.println("Name : " + obj.getName() + "\n Age: " + obj.getAge());

		objSubPackage.testLibMethod();
	}
}