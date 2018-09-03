package com.capgemini.day4;

public class President extends Employee1{
	
	private double kilometerTravelled;
	private double tourAllowance;			
	private final double TELEPHONE_ALLOWANCE=2000;
	public President() {
		super();
		// TODO Auto-generated constructor stub
	}
	public President(long employeeId, String employeeName, double kilometerTravelled) {
		super(employeeId, employeeName);
		this.kilometerTravelled=kilometerTravelled;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		double salary=super.calculateNetSalary(basicSalary);
		tourAllowance= 8 * kilometerTravelled;
		super.setNetSalary(super.getNetSalary() + tourAllowance + TELEPHONE_ALLOWANCE);
	
		return super.getNetSalary();

	}
	
	  
	  
}
