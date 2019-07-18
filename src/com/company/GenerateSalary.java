package com.company;
import java.io.*;


public class GenerateSalary {

    public static void main(String[] args) throws IOException {


        EmployeeType type = new EmployeeType();
        System.out.println("Enter the employee type for which we calculate the average annual salary: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String employeeType = reader.readLine();
        System.out.println("Employee's average annual salary is: ");
        Employee E = type.getEmployeeType(employeeType);
        E.setMonthlySalary();
        E.getAnnualSalary();


    }

}
