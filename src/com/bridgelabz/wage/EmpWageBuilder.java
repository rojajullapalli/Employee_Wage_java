package com.bridgelabz.wage;

import java.util.Scanner;

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
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        private String companyName;
        private int empRatePerHr;
        private int numOfWorkingDays;
        private int numOfWorkingHours;


        public EmpWageBuilder(String companyName, int empRatePerHr, int numOfWorkingDays, int numOfWorkingHours) {
            this.companyName = companyName;
            this.empRatePerHr = empRatePerHr;
            this.numOfWorkingDays = numOfWorkingDays;
            this.numOfWorkingHours = numOfWorkingHours;

        }
        

    public static String isPresent(){
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch(empCheck) {
            case IS_FULL_TIME:
                return "present";
            case IS_PART_TIME:
                return "parttime";
            default:
                return "absent";
        }
    }

    public int dailywage() {
        int totalworkingdays = 1;
        int totalworkinghours = 0;
        int empHrs = 0;
        int totalempwage = 0;
        int empwage;
        while (totalworkingdays <= numOfWorkingDays && totalworkinghours <= numOfWorkingHours) {
            String check = isPresent();
            if (check == "present")
                empHrs = 8;
            else if (check == "parttime")
                empHrs = 4;
            else
                empHrs = 0;
            empwage = empHrs * empRatePerHr;
            totalempwage += empwage;
            totalworkinghours += empHrs;
            System.out.println("employee wage for day " + totalworkingdays + " is " + empwage);
            totalworkingdays++;
        }
        System.out.println("total employee wage " + totalempwage);
        System.out.println("total working hours " + totalworkinghours);
        System.out.println("Total Wage of " + companyName + " Employee is " + totalempwage);
        return totalworkingdays;
    }

    public static void getInput(){
        Scanner sc=new Scanner(System.in);
        EmpWageBuilder bridgelabz=new EmpWageBuilder("bridgelabz",20,20,60);
        EmpWageBuilder infosys=new EmpWageBuilder("infosys",30,28,120);
        bridgelabz.dailywage();
        infosys.dailywage();

    }

    public static void main(String[] args) { getInput(); }
}