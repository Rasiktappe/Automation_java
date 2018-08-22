package com.test.org.Automation_Practice_2;

import com.x.Main_Java_Class_2;

public class Main_Java_Class extends Main_Java_Class_2 {
	
	public Main_Java_Class()
	{
		super(20);
	}

	public static void main(String[] args) {
		
		B_Class refB = new B_Class();
		
		System.out.println(refB.a);
		
		refB.morning();
		refB.evening();

		
		B_Class refA = new A_Class();
		
		refA.morning();
		
		calculation cal = new calculation();
		
		cal.add(30,70);
		
		Main_Java_Class ref = new Main_Java_Class();
//		
		ref.morning();
		ref.evening();
	
		//LMNInterface.evening();
		//XYZInterface.evening();
		
		ref.afternoon();
		ref.Midnight();
		
		Main_Java_Class_2 java2= new Main_Java_Class_2();
		
		ref.method();
		

	}
	
	public void method()
	{
		System.out.println("Method");
	
	try {
		System.out.println(5/0);
		
	} catch (Exception e) {
		System.out.println("Error in arithmatic operation");
	}
	finally {
		System.out.println("execute every time");
	}

	//Main_Java_Class cla = new Main_Java_Class();
	
	
	
	}

}
