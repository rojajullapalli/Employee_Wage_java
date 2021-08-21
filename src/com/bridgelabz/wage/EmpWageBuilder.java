package com.bridgelabz.wage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder {

    public static void getInput(){
            EmployeeMain wage=new EmployeeMain();
            //CompanyDetails[] company=new CompanyDetails[2];
        ArrayList<CompanyDetails> company= new ArrayList<CompanyDetails>();
            company.add(new CompanyDetails("bridgelabz",20,20,20));
            wage.dailywage(company.get(0));
            company.add(new CompanyDetails("infosys",30,25,60));
            wage.dailywage(company.get(1));
        while( true )	{
            System.out.println("Welcome to Employee wage portal");
            System.out.println("Enter your choice to see the Total wage of an Employee of a particular company");
            System.out.println("Press 1 for Bridgelabz");
            System.out.println("Press 2 for Infosys");
            System.out.println("Press 3 to Exit");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if( option == 1 )	{
                System.out.println( "The Total Employee Wage of Bridgelabz is: " + company.get(0).getTotalEmpWage() );
            }
            else if( option == 2 )	{
                System.out.println( "The Total Employee Wage of Infosys is: " + company.get(1).getTotalEmpWage() );
            }
            else if( option == 3 )	{
                System.exit(0);
            }
            else	{
                System.out.println("Invalid option \n Try again");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        getInput();
    }
}