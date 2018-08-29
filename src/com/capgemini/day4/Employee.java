package com.capgemini.day4;

public class Employee {

	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	public final double specialAllowance = 250.80;
	public final double HRA = 1000.50;

	public Employee() {

	}

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeId = employeeId;
		this.employeePhone = employeePhone;
	}

	public double calculateSalary(double basicSalary) {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * HRA / 100);
		System.out.println(salary);
		System.out.println(employeeId+"\n"+employeeName+"\n"+employeeAddress+"\n"+employeePhone);
		return salary;
	}

}
