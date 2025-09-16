package edu.citadel.hw1;

import java.time.LocalDate;

// Abstract class that implements Comparable<Employee>
public abstract class Employee implements Comparable<Employee> {
    private String name; // private field str name
    private LocalDate hireDate; // private field LocalDate hireDate

    //Public Constructor that initializes name and hireDate
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Abstract method getMonthlyPay() that returns a double
    public abstract double getMonthlyPay();

    // order employees based on their monthly salaries
    @Override
    public int compareTo(Employee other) {
        return Double.compare(getMonthlyPay(), other.getMonthlyPay());
    }
}
