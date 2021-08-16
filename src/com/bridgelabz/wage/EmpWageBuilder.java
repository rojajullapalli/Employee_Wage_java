package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is fulltime or absent or partime using case statement.
 * Based upon Employee is fulltime,absent,parttime then it will calculate the wage of the employee for day.
 *claculating wage for month and no of working as 20 and maximum hours in month is 100.
 *
 * @author : roja
 * @version :1.5
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;//constant to check employee is full time.
    public static final int IS_FULL_TIME = 2;//constant to check employee is part time.
    public static final int EMP_RATE_PER_HOUR = 20;//constant to how much employee will get paid according to hour.
    public static final int NUM_OF_WORKING_DAYS = 20;//constant to how many working days in month.
    public static final int MAX_HRS_IN_MONTH = 100;//constant to max hours in month is 100.
    public static void main(String[] args) {
        int empHrs = 0;//variable
        int totalEmpHrs = 0;//variable
        int totalWorkingDays = 0;//variable
        //checking the totalEmpHrs is less than or equal to MAX_HRS_IN_MONTH (i.e less than or equal to 100)
        // checking the totalworkingdays is lessthan or equal to NUM_OF_WORKING_DAYS (i.e less than or equal to 20)
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
            //increment totalWorkingDays by 1
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;//it will generate the random number between 0 to 2 and stores it in empcheck
            /**
             * if empcheck equal to 1 then it goes to case IS_FULL_TIME and print employee is fulltime and his working hours as 8 .
             * if empcheck equal to 2 then it goes to case IS_PART_TIME and print employee is parttime and his working hours as 4.
             * if empcheck is 0 then goes to default case employee is absent and his working hours as 0.
             */
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
            //it will add total Employee working hours
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " empHrs: " + empHrs);
        }
        System.out.println("total eployee hours" +totalEmpHrs);
            //calculate the total wage
            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}