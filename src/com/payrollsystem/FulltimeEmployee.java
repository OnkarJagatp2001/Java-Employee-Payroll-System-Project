package com.payrollsystem;

public class FulltimeEmployee extends Employee {

	private double monthlySalary;

	public FulltimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}
