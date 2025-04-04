
package com.hr.model;

public class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String employeeId, String name, double baseSalary, double bonusPercentage) {
        super(employeeId, name, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * bonusPercentage / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Total Salary: " + calculateSalary());
    }
}
