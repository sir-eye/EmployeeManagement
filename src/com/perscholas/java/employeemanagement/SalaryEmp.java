package com.perscholas.java.employeemanagement;

public class SalaryEmp extends Employee {
    public SalaryEmp(String firstName, String lastName, String title, double annualSalary) {
        super(firstName, lastName, title, annualSalary);
    }

    @Override
    public double calculateSalary() {
        return payRate / 24; // Bi-monthly salary
    }

    public void display() {
        System.out.println(toString());
        System.out.println("Bi-Monthly Salary: $" + calculateSalary());
    }
}