package com.harshit1108.Chain_Of_Responsibility;

public class Employee {

    private int id;

    private int numberOfDays;

    private int grade;

    private ReasonType reason;

    public Employee(int id, int numberOfDays, int grade, ReasonType reason) {
        this.id = id;
        this.numberOfDays = numberOfDays;
        this.grade = grade;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ReasonType getReason() {
        return reason;
    }

    public void setReason(ReasonType reason) {
        this.reason = reason;
    }
}
