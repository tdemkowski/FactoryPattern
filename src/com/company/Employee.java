package com.company;

abstract class Employee {

    protected double monthlySalary;
    abstract void setMonthlySalary();

    public void getAnnualSalary() {
        System.out.println(monthlySalary*12);
    }



}
