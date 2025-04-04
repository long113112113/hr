package com.hr.model;

public class Developer extends Employee{
    private int overtimeHours;

    public Developer(String employeeId, String name, double baseSalary, int overtimeHours) {
        super(employeeId, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * 20);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
