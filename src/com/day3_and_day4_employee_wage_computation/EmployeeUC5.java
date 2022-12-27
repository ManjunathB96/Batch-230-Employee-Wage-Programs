package com.day3_and_day4_employee_wage_computation;

public class EmployeeUC5 {
    /*
    EmployeeUC5
    Calculating Wages for a Month

     */
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;

    public static final int NUM_F_WORKING_DAYS = 2;


    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int day = 0; day <= NUM_F_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HR;
            totalWage += empWage;
            System.out.println("Wage of Employee is :" + empWage);
        }

        System.out.println("Total Wage :" + totalWage);
    }
}