package Iterator;

public class Client {
    public static void main(String[] args) {
        String[] names = {"Ion", "Marcel", "Anton", "Stanislav", "Eugen"};
        NameRepository nameRepository = new NameRepository(names);

        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
