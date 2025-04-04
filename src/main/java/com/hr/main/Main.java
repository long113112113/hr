package com.hr.main;

import com.hr.model.Developer;
import com.hr.model.Employee;
import com.hr.model.Manager;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Manager("mng1", "Charlie", 100, 20);
        Employee employee2 = new Manager("mng2", "Alice", 200, 30);
        Employee employee3 = new Developer("dvp1", "Bob", 300, 10);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();


    }

}