package com.harshit1108.Composite;
// Leaf
public class ElectronicDepartment implements Department {

    private Long id;
    private String name;

    public ElectronicDepartment(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public void displayDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
