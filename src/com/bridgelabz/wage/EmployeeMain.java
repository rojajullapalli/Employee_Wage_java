package com.bridgelabz.wage;

import java.util.ArrayList;

public class EmployeeMain implements employee {

    ArrayList<Integer> employeeDailyWage = new ArrayList<Integer>();
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

    public void dailywage(CompanyDetails employee) {
        int totalworkingdays = 1;
        int totalworkinghours = 0;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int empDailyWage=0;
        while (totalworkingdays < employee.getNumOfWorkingDays() && totalworkinghours < employee.getNumOfWorkingHours()) {
            String check = isPresent();
            if (check == "present")
                empHrs = 8;
            else if (check == "parttime")
                empHrs = 4;
            else
                empHrs = 0;
            totalEmpHrs += empHrs;
            totalworkinghours += empHrs;
            empDailyWage = empHrs * employee.getEmpRatePerHr();
            System.out.println("Daily Wage for "+employee.getCompanyName()+" is "+empDailyWage);
            employeeDailyWage.add( empDailyWage );
            System.out.println("employee wage " +employee.getCompanyName()+" for day " + totalworkingdays + "working hours is " + empHrs);
            totalworkingdays++;
        }
        employee.setTotalEmpWage(totalEmpHrs * employee.getEmpRatePerHr());
        System.out.println("total working hours " + totalEmpHrs);
        System.out.println("Total Wage of " + employee.getCompanyName() + " Employee is " + employee.getTotalEmpWage());
    }
}
