package com.java;

public class EmpWageCmp {
	public static void main(String[] args)
{
		System.out.println("Welcome to Employee Wage Computiong");
		
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
				int empHrs = 0;
				int empWage = 0;
				
		double empcheck = Math.floor(Math.random() * 10)% 2;
		
		if (empcheck == IS_FULL_TIME)
			empHrs = 8;
		
		//	System.out.println("Employee is Present");
		else
			//System.out.println("Employee is Absent");
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HR ;
		System.out.println("Emp Wage: "  + empWage);
	
}
}