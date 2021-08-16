package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is fulltime or absent or partime using case statement.
 * Based upon Employee is fulltime,absent,parttime then it will calculate the wage of the employee for day.
 *
 * @author : roja
 * @version :1.3
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    /**
     * if we declare inside the class outside the main we are declaring as a global so it can be accesed throughout the program.
     */
    public static final int IS_FULL_TIME = 1;//constant to check employee is full time
    public static final int IS_PART_TIME = 2;//constant to check employee is part time
    public static final int empRatePerHr = 20;//constant to how much employee will get paid according to hour
    public static void main(String[] args) {
        //if we declare inside the main it will get as local and it can only accessed by main function or method
        int salary=0;//variable
        int empHrs=0;//variable
        int empcheck =(int) Math.floor(Math.random() * 10) % 3; //it will generate the random number between 0 to 2 and stores it in empcheck
        /**
         * if empcheck equal to 1 then it goes to case IS_FULL_TIME and print employee is fulltime and his working hours as 8 .
         * if empcheck equal to 2 then it goes to case IS_PART_TIME and print employee is parttime and his working hours as 4.
         * if empcheck is 0 then goes to default case employee is absent and his working hours as 0.
         */
        switch(empcheck){
            case IS_FULL_TIME:
                System.out.println("Employee is fulltime present");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is parttime");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is absent");
                empHrs = 0;
                break;
        }
        //his salary(paycheck or wage) of the day is calculated based on fulltime or partime or absent.
        salary = empHrs * empRatePerHr;
        System.out.println("salary is " +salary);
    }
}