package com.harshit1108.Chain_Of_Responsibility;

public class Manager extends LeaveHandler {

    @Override
    public String applyLeaves(Employee employeeLeave) {
        if(employeeLeave.getNumberOfDays()<=21){
            if(employeeLeave.getGrade()<=3){
                return "Your leave is approved..." + getClass().getSimpleName();
            } else {
                return "Your employee grade is too low..." + getClass().getSimpleName();
            }
        } else {
            return  "Your leave request is too long...";
        }
    }


}
