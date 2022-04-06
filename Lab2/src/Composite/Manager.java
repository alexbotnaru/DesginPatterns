package Composite;

import java.util.LinkedList;
import java.util.List;

public class Manager implements Employee{

    private String name;
    private Long id;

    private List<Employee> employeeList = new LinkedList<>();

    public Manager(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employees working under: " + name);
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employeeList);
    }
}
