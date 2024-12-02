package com.perscholas.java.employeemanagement;

public class HourlyEmp extends Employee {
    private double hoursWorked;

    public HourlyEmp(String firstName, String lastName, String title, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, title, hourlyRate);
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return payRate * hoursWorked; // Weekly pay
    }


    public void display() {
        System.out.println(toString());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Pay: $" + calculateSalary());
    }
}