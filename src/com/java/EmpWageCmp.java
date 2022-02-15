package com.java;

public class EmpWageCmp {
	
		// constants
		
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
		public static final int EMP_RATE_PER_HR = 20;
		
		public static void main(String[] args)
		{
			System.out.println("Welcome to Employee Wage Computiong");
			System.out.println("Solving Using Switch Case statment");
			
		//Variables
				int empHrs = 0;
				int empWage = 0;
				// Computation
		double empcheck = Math.floor(Math.random() * 10)% 3;
		switch ((int)empcheck) {
		
			case IS_FULL_TIME :
				empHrs = 16;
				break;
			case IS_PART_TIME :
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
	
		//if (empcheck == IS_FULL_TIME)
			//empHrs = 16;
		
		//	System.out.println("Employee is Present");
		//else if (empcheck == IS_PART_TIME)
			//System.out.println("Employee is Absent");
			//empHrs = 8;
		empWage = empHrs * EMP_RATE_PER_HR ;
		System.out.println("Emp Wage: "  + empWage);
	
}
}