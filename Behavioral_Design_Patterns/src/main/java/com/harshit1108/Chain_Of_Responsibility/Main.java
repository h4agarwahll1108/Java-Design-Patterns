package com.harshit1108.Chain_Of_Responsibility;
/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 *
 * The Chain of Responsibility pattern allows a number of classes to attempt to handle a request independently.
 *
 */
public class Main {
    public static void main(String[] args) {

        TeamLead teamLead = new TeamLead();
        HR hr = new HR();
        Manager manager = new Manager();

        //Chaining the responsibility.
        teamLead.setNextValue(hr);
        hr.setNextValue(manager);

        //TeamLead
        Employee employee = new Employee(1,4,2,ReasonType.REGULAR);
        System.out.println(teamLead.applyLeaves(employee));

        //HR
        Employee employee1 = new Employee(2,12,3,ReasonType.CRITICAL);
        System.out.println(teamLead.applyLeaves(employee1));

        //Manager
        Employee employee2 = new Employee(3,18,3,ReasonType.SPECIAL);
        System.out.println(teamLead.applyLeaves(employee2));

    }
}