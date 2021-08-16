package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is present or not.
 * Employee is present then it will calculate the wage of the employee for day.
 *
 * @author : roja
 * @version :1.1
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1; //constant to check employee is full time
        int empRatePerHr = 20; //constant to how much employee will get paid according to hour
        int salary; //variable
        int empHrs; //variable
        double empcheck = Math.floor(Math.random() * 10) % 2; //it will generate the random number between 0 and 1 and stores it in empcheck
        /**
         * if empcheck equal to 1 then it goes to if and print employee is present and his working hours as 8 .
         * if empcheck is 0 then goes to else employee is absent and his working hours as 0.
         */
        if (empcheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            empHrs = 8;
        } else {
            System.out.println("Employee is absent");
            empHrs = 0;
        }
        //his salary(paycheck or wage) of the day is calculated based on present and absent.
        salary = empHrs * empRatePerHr;
        System.out.println("salary is " + salary);
    }
}