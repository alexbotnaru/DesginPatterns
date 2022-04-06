package Composite;

public class Developer implements Employee{

    private String name;
    private Long id;
    private String position;

    public Developer(String name, Long id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }
}
