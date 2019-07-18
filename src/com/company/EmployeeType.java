package com.company;

public class EmployeeType {

    public Employee getEmployeeType(String employeeType) {
        if(employeeType == null) {
            return null;
        }
        if(employeeType.equalsIgnoreCase("PACKER")) {
            return new Packer();
        }
        else if(employeeType.equalsIgnoreCase("COURIER")) {
            return new Courier();
        }
        else if(employeeType.equalsIgnoreCase("MANAGER")) {
            return new Manager();
        }
        return null;
    }

}
