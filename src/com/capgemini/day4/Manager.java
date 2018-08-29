package com.capgemini.day4;

public class Manager extends Employee {

	Manager manager=new Manager();
	public Manager()
	{
		
	}
	public Manager(long employeeId,String employeeName)
	{
		super(12345,"Ram","Delhi", 123);
		calculateSalary(10000);
	}
	
	
	
}
