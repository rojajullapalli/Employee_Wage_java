package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is fulltime or absent or partime using case statement.
 * Based upon Employee is fulltime,absent,parttime then it will calculate the wage of the employee for day.
 *claculating wage for month and no of working as 20
 *
 * @author : roja
 * @version :1.4
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;//constant to check employee is full time
    public static final int IS_FULL_TIME = 2;//constant to check employee is part time
    public static final int EMP_RATE_PER_HOUR = 20;//constant to how much employee will get paid according to hour
    public static final int NUM_OF_WORKING_DAYS = 20;//constant to how many working days in month
    public static void main(String[] args) {
        int empHrs = 0;//variable
        int salary = 0;//variable
        int totalsalarymonth = 0;//variable
        //for iterating purpose for day 1 to 20 .it will increment the value by 1 until it reaches 20.
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;//it will generate the random number between 0 to 2 and stores it in empcheck it will generate for every iteration
            /**
             * if empcheck equal to 1 then it goes to case IS_FULL_TIME and print employee is fulltime and his working hours as 8 .
             * if empcheck equal to 2 then it goes to case IS_PART_TIME and print employee is parttime and his working hours as 4.
             * if empcheck is 0 then goes to default case employee is absent and his working hours as 0.
             */
            switch(empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("parttime for day "+day);
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("fulltime for day "+day);
                    break;
                default:
                    empHrs = 0;
                    System.out.println("absent for day "+day);
            }
            //his salary(paycheck or wage) of the day is calculated based on fulltime or partime or absent for eeach increement
            salary = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("salary "+ salary);
            // add the total salary (wage)
            totalsalarymonth=totalsalarymonth+salary;
        }
        System.out.println("Total salary for month: " + totalsalarymonth);
    }
}