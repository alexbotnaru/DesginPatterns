package Command;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("Opening file " + name);
    }

    public void save() {
        System.out.println("Saving file " + name);
    }

    public void close() {
        System.out.println("Closing file " + name);
    }
}
