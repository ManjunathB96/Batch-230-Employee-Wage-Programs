package com.day_4_employee_wage_computation;

public class EmployeeUC7 {
    /*
    EmployeeUC7
    Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class Variables
     */
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
        EmployeeUC7 uc7 = new EmployeeUC7();
        uc7.computeEmpWage();
    }

    public void computeEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int day = 0; day <= NUM_OF_WORKING_DAYS; day++) {
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