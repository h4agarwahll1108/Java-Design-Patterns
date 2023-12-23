package com.harshit1108.Chain_Of_Responsibility;

public abstract class LeaveHandler {

    protected LeaveHandler nextValue;

    public void setNextValue(LeaveHandler nextValue) {
        this.nextValue = nextValue;
    }

    public abstract String applyLeaves(Employee employeeLeave);
}
