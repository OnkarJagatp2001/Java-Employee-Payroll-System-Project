package com.payrollsystem;

public class Main {

	public static void main(String[] args) {
		PayrollSystem payrollSystem = new PayrollSystem();
		
		FulltimeEmployee fullTimeEmployee = new FulltimeEmployee("Vikas",2131,4343454.43);
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Tushar", 233, 45, 70);
		
		payrollSystem.addEmployee(fullTimeEmployee);
		payrollSystem.addEmployee(partTimeEmployee);
		
		System.out.println("Initial Employee Datails: ");
		payrollSystem.displayEmployee();
		
		System.out.println("Removing Employee");
		payrollSystem.removeEmployee(233);

		System.out.println("Employees after removing contracted employee");
		payrollSystem.displayEmployee();
		

	}

}
