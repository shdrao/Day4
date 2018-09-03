package com.capgemini.day4;

public class SalesManager extends Employee1 {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesManager(long employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		double salary=super.calculateNetSalary(basicSalary);
		petrolAllowance = 0.08 * basicSalary;
		foodAllowance = 0.13 * basicSalary;
		otherAllowance = 0.03 * basicSalary;
		super.setNetSalary(salary + petrolAllowance + foodAllowance + otherAllowance);
		return super.getNetSalary();

	}

}
