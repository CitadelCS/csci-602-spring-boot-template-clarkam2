package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hoursWorked;

    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double getMonthlyPay() {
        return wageRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[name=" + getName() + ", hireDate=" + getHireDate() +
                ", wageRate=" + wageRate +
                ", hoursWorked=" + hoursWorked +
                ']';
    }

    // Public methods hashCode() and equals()
    // built using the generate equals() and hash_code()
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return Double.compare(wageRate, that.wageRate) == 0 && Double.compare(hoursWorked, that.hoursWorked) == 0;
    }

    // built using the generate equals() and hash_code()
    @Override
    public int hashCode() {
        return Objects.hash(wageRate, hoursWorked);
    }
}
