package com.bridgelabz.wage;

import java.util.ArrayList;

public class EmpWageBuilder {

    public static void getInput(){
            EmployeeMain wage=new EmployeeMain();
            //CompanyDetails[] company=new CompanyDetails[2];
        ArrayList<CompanyDetails> company= new ArrayList<CompanyDetails>();
            company.add(new CompanyDetails("bridgelabz",20,20,20));
            wage.dailywage(company.get(0));
            company.add(new CompanyDetails("infosys",30,25,60));
            wage.dailywage(company.get(1));

    }

    public static void main(String[] args) {
        getInput();
    }
}