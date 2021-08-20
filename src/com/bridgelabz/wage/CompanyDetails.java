package com.bridgelabz.wage;

public class CompanyDetails {
    private String companyName;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int numOfWorkingHours;
    private int totalEmpWage;


    public CompanyDetails(String companyName, int empRatePerHr, int numOfWorkingDays, int numOfWorkingHours) {
        this.companyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.numOfWorkingHours = numOfWorkingHours;

    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public int getNumOfWorkingHours() {
        return numOfWorkingHours;
    }

    public void setTotalEmpWage(int totalEmpWage )	{
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage()  {
        return totalEmpWage;
    }

}
