package com.capgemini.day4;

public class Employee1 {
	private long employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	private final double PT = 200;
	private double grossSalary;

	public final double MEDICAL = 500;
	private double netSalary;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(long employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}

	public double calculateNetSalary(double basicSalary) {
		hra = 0.5 * basicSalary;
		pf = 0.12 * basicSalary;
		grossSalary = hra + basicSalary + MEDICAL;
		netSalary = grossSalary - (pf + PT);
		return netSalary;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getPT() {
		return PT;
	}

	public double getMEDICAL() {
		return MEDICAL;
	}

	public void displayDetails() {
		System.out.println("Employee ID"+ ":" + employeeId  + "\nEmployee Name" + ":" + employeeName +"\nEmployee Net Salary"+":" + netSalary);
		System.out.println();
	}

}
