package com.harshit1108.Chain_Of_Responsibility;

public class HR extends LeaveHandler {

    @Override
    public String applyLeaves(Employee employeeLeave) {
        if(employeeLeave.getNumberOfDays()<=14){
            if(employeeLeave.getGrade()<=3 && !employeeLeave.getReason().equals(ReasonType.SPECIAL)){
                return "Your leave is approved..." + getClass().getSimpleName();
            } else {
                return "Your employee grade is too low..." + getClass().getSimpleName();
            }
        } else {
            return  nextValue.applyLeaves(employeeLeave);
        }
    }
}
