package Composite;

public class Client {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Alexandru", 100L, "Back-End Developer");
        Employee developer2 = new Developer("Cezar", 101L, "Front-End Developer");

        Manager developmentManager = new Manager("Development Manager", 1000L);

        developmentManager.addEmployee(developer1);
        developmentManager.addEmployee(developer2);

        Employee tester1 = new Tester("Valeriu", 200L, "Automation testing");
        Employee tester2 = new Tester("Marcel", 201L, "Manual testing");

        Manager testingManager = new Manager("Testing Manager" ,1001L);
        testingManager.addEmployee(tester1);
        testingManager.addEmployee(tester2);

        Manager generalManager = new Manager("General Manager", 10000L);
        generalManager.addEmployee(developmentManager);
        generalManager.addEmployee(testingManager);

        generalManager.showEmployeeDetails();
    }
}
