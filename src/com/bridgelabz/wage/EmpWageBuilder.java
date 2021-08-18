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
    public static final int IS_PART_TIME = 1;//constant to check employee is full time
    public static final int IS_FULL_TIME = 2;//constant to check employee is part time

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

    public static int dailywage(int empRatePerHr, int numOfWorkingDays, int NumOfWorkingHours){
        int totalworkingdays=1;
        int totalworkinghours=0;
        int empHrs=0;
        int totalempwage=0;
        int empwage;
        while(totalworkingdays<=numOfWorkingDays && totalworkinghours<=NumOfWorkingHours) {
            String check = isPresent();
            if (check == "present")
                empHrs = 8;
            else if (check == "parttime")
                empHrs = 4;
            else
                empHrs = 0;
            empwage = empHrs * empRatePerHr;
            totalempwage+=empwage;
            totalworkinghours+=empHrs;
            System.out.println("employee wage for day " + totalworkingdays + " is " + empwage);
            totalworkingdays++;
        }
        System.out.println("total employee wage "+totalempwage);
        System.out.println("total working hours " +totalworkinghours);
        return totalworkingdays;
    }

    public static void getInput(){
        Scanner sc=new Scanner(System.in);
        CompanyDetails company1 = new CompanyDetails();
        System.out.println("enter the values for employee rate per hour");
        company1.setEmpRatePerHr(sc.nextInt());
        System.out.println("enter number of woring days");
        company1.setNumOfWorkingDays(sc.nextInt());
        System.out.println("enter number of working hours");
        company1.setNumOfWorkingHours(sc.nextInt());
        System.out.println("enter the above details for company1");
        System.out.println("emp rate/hr = " +company1.getEmpRatePerHr()+" number of working days = " +company1.getNumOfWorkingDays()+"number of working hours "+company1.getNumOfWorkingHours());

        CompanyDetails company2 = new CompanyDetails();
        System.out.println("enter the above details for company2");
        System.out.println("enter the values for employee rate per hour");
        company2.setEmpRatePerHr(sc.nextInt());
        System.out.println("enter number of woring days");
        company2.setNumOfWorkingDays(sc.nextInt());
        System.out.println("enter number of working hours");
        company2.setNumOfWorkingHours(sc.nextInt());
        System.out.println("emp rate/hr = " +company2.getEmpRatePerHr()+" number of working days = " +company2.getNumOfWorkingDays()+"number of working hours "+company2.getNumOfWorkingHours());

        System.out.println("employee wage for company1 is");
        dailywage(company1.getEmpRatePerHr(), company1.getNumOfWorkingDays(), company1.getNumOfWorkingHours());
        System.out.println("employee wage for company2 is");
        dailywage(company2.getEmpRatePerHr(), company2.getNumOfWorkingDays(), company2.getNumOfWorkingHours());

    }

    public static void main(String[] args) {
        getInput();
    }
}