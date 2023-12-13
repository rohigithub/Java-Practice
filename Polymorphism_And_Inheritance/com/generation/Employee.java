package com.generation;

public class Employee {
    public String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public int timeToRetirement() {
        int timetoretirement = min(60 - age, 40 - yearsWorked);
        return timetoretirement;

    }

    public int vacationTimeLeft() {
        int vacationtimeleft = (daysWorked / 360) * (30 - vacationDaysTaken);
        return vacationtimeleft;
    }

    public int calculateBonus() {
        int bonus = 2.2 * salary;
        return bonus;
    }

}