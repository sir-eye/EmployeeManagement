package com.perscholas.java.employeemanagement;

public class CommissionedEmp extends HourlyEmp {
    private double totalSales;
    private double commissionRate = 0.10;

    public CommissionedEmp(String firstName, String lastName, String title, double hourlyRate, double hoursWorked, double totalSales) {
        super(firstName, lastName, title, hourlyRate, hoursWorked);
        this.totalSales = totalSales;
    }


    @Override
    public double calculateSalary() {
        double basePay = super.calculateSalary();
        double commission = (totalSales > 1000) ? totalSales * commissionRate : 0;
        return basePay + commission;
    }


    @Override
    public void display() {
        System.out.println(toString());
        System.out.println("Hourly Rate: $" + getPayRate());
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Weekly Pay with Commission: $" + calculateSalary());
    }
}
