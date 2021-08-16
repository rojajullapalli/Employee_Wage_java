package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is fulltime or absent or partime.
 * Based upon Employee is fulltime,absent,parttime then it will calculate the wage of the employee for day.
 *
 * @author : roja
 * @version :1.1
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;//constant to check employee is full time
        int IS_PART_TIME = 2;//constant to check employee is part time
        int empRatePerHr = 20;//constant to how much employee will get paid according to hour
        int salary;//variable
        int empHrs;//variable
        ////it will generate the random number between 0 to 2 and stores it in empcheck.
        double empcheck = Math.floor(Math.random() * 10) % 3;
        /**
         * if empcheck equal to 1 then it goes to if and print employee is fulltime and his working hours as 8 .
         * if empcheck equal to 2 then it goes to else if and print employee is parttime and his working hours as 4.
         * if empcheck is 0 then goes to else employee is absent and his working hours as 0.
         */
        if (empcheck ==  IS_FULL_TIME) {
            System.out.println("Employee is fulltime present");
            empHrs = 8;
        }
        else if (empcheck == IS_PART_TIME){
            System.out.println("Employee is parttime");
            empHrs = 4;
        }
        else {
            System.out.println("Employee is absent");
            empHrs = 0;
        }
        //his salary(paycheck or wage) of the day is calculated based on fulltime or partime or absent.
        salary = empHrs * empRatePerHr;
        System.out.println("salary is " +salary);
    }
}