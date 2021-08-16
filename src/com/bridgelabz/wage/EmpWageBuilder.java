package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is fulltime or absent or partime using case statement.
 * Based upon Employee is fulltime,absent,parttime then it will calculate the wage of the employee for day.
 *claculating wage for month and no of working as 20 and maximum hours in month is 100.
 *
 * @author : roja
 * @version :1.6
 * @since :15-08-2021
 **/
public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int empRatePerHr = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int Num_OF_WORKING_HOURS = 100;
    public static int empwage;
    public static String ispresent(){
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch(empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is fulltime present");
                return "present";
            case IS_PART_TIME:
                System.out.println("Employee is parttime");
                return "parttime";
            default:
                System.out.println("Employee is absent");
                return "absent";
        }
    }
    public static void dailywage(){
        int totalworkingdays=1;
        int totalworkinghours=0;
        int empHrs=0;
        while(totalworkingdays<=NUM_OF_WORKING_DAYS && totalworkinghours<=Num_OF_WORKING_HOURS) {
            String check = ispresent();
            if (check == "present")
                empHrs = 8;
            else if (check == "parttime")
                empHrs = 4;
            else
                empHrs = 0;
            empwage = empHrs * empRatePerHr;
            totalworkinghours+=empHrs;
            System.out.println("employee wage for day " + totalworkingdays + " is " + empwage);
            totalworkingdays++;
        }
        System.out.println("total working hours " +totalworkinghours);
    }

    public static void main(String[] args) {
        dailywage();
    }

}