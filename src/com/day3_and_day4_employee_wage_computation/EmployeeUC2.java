package com.day3_and_day4_employee_wage_computation;

public class EmployeeUC2 {
    /*
    Calculate Daily Employee Wage
     */
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Emp Daily Wage :" + empWage);
    }
}