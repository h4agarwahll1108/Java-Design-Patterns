package com.harshit1108.Composite;
// Composite
import java.util.ArrayList;
import java.util.List;

public class University  implements Department{

    private Long id;
    private String name;

    private List<Department> departmentList;

    public University(Long id, String name) {
        this.id = id;
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    @Override
    public void displayDepartmentName() {
        departmentList.forEach(Department::displayDepartmentName);
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void removeDepartment(Department department) {
        departmentList.remove(department);
    }
}
