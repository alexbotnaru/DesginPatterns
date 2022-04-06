package Proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        System.out.println("First call");
        image.display();

        System.out.println("Second call");
        image.display();
    }
}
