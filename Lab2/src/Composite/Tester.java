package Composite;

public class Tester implements Employee{

    private String name;
    private Long id;
    private String position;

    public Tester(String name, Long id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }

}
