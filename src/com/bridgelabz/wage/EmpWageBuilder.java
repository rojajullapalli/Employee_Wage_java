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

    public static void getInput(){
            EmployeeMain wage=new EmployeeMain();
            CompanyDetails[] company=new CompanyDetails[2];
            company[0]=new CompanyDetails("bridgelabz",20,20,20);
            company[1]=new CompanyDetails("infosys",30,25,60);
            wage.dailywage(company[0]);
            wage.dailywage(company[1]);

    }

    public static void main(String[] args) { getInput(); }
}