package com.bridgelabz.wage;
/**
 *EmpWageBuildweUC1 is an application to check whether Employee is present or not.
 *
 * @author : roja
 * @version :1.0
 * @since :10-08-2021
 **/
public class EmpWageBuilder {
    public static void main(String[] args) {
        //constant to check employee is full time
        int IS_FULL_TIME = 1;
        //it will generate the random number between 0 and 1 and stores it in empcheck
        double empcheck = Math.floor(Math.random() * 10) % 2;
        /**
         * if empcheck equal to 1 then it goes to if and print employee is present .
         *if empcheck is 0 then goes to else employee is absent.
         **/
        if (empcheck ==  IS_FULL_TIME) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}