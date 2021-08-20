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

    public static int dailywage(CompanyDetails employee) {
        int totalworkingdays = 1;
        int totalworkinghours = 0;
        int empHrs = 0;
        int totalEmpHrs=0;
        while (totalworkingdays <= employee.getNumOfWorkingDays() && totalworkinghours <= employee.getNumOfWorkingHours()) {
            String check = isPresent();
            if (check == "present")
                empHrs = 8;
            else if (check == "parttime")
                empHrs = 4;
            else
                empHrs = 0;
            totalEmpHrs += empHrs;
            totalworkinghours += empHrs;
            System.out.println("employee wage for day " + totalworkingdays + "working hours is " + empHrs);
            totalworkingdays++;
        }
        employee.setTotalEmpWage( totalEmpHrs * employee.getEmpRatePerHr() );
        System.out.println("total working hours " + totalEmpHrs);
        System.out.println("Total Wage of " + employee.getCompanyName() + " Employee is " + employee.getTotalEmpWage());
        return totalworkingdays;
    }

    public static void getInput(){
        EmpWageBuilder wage=new EmpWageBuilder();
       CompanyDetails[] company=new CompanyDetails[2];
        company[0]=new CompanyDetails("bridgelabz",20,20,20);
        company[1]=new CompanyDetails("infosys",30,25,60);
        EmpWageBuilder.dailywage(company[0]);
        EmpWageBuilder.dailywage(company[1]);

    }

    public static void main(String[] args) { getInput(); }
}