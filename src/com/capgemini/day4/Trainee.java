package com.capgemini.day4;

public class Trainee extends Employee {

	Trainee trainee=new Trainee();
	public Trainee()
	{
		
	}
	public Trainee(long employeeId,String employeeName)
	{
		super(54321,"Tom","Goa", 321);
		calculateSalary(2000);
	}
	
	
	
}
