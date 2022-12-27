package com.day_3_employee_wage_computation;

public class EmployeeUC1 {
    /*
    Check employee is present or absent
     */
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        Double empCheck = Math.floor((Math.random() * 10) % 2 );
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee is Present is Name : Manjunath");
        }
        else {
            System.out.println("Employee is Absent is Name:Manjunath");

        }
    }
}