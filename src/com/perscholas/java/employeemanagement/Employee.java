package com.perscholas.java.employeemanagement;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;

    public Employee() {}


    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }


    public double calculateSalary() {
        return 0.0;
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPayRate() { return payRate; }
    public void setPayRate(double payRate) { this.payRate = payRate; }


    public void inputEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee type (salaried/hourly): ");
        String type = scanner.nextLine().toLowerCase();

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter title: ");
        this.title = scanner.nextLine();

        if (type.equals("salaried")) {
            System.out.print("Enter annual salary: ");
            this.payRate = scanner.nextDouble();
            SalaryEmp salariedEmployee = new SalaryEmp(firstName, lastName, title, payRate);
            salariedEmployee.display();
        } else if (type.equals("hourly")) {
            System.out.print("Enter hourly rate: ");
            this.payRate = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();

            HourlyEmp hourlyEmployee = new HourlyEmp(firstName, lastName, title, payRate, hoursWorked);
            hourlyEmployee.display();
        } else {
            System.out.println("Invalid employee type entered.");
        }
    }


    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Title: " + title;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.payRate, payRate) == 0 &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                title.equals(employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}