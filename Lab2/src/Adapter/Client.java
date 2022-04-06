package Adapter;

public class Client {
    public static void main(String[] args) {

        AmericanPlug americanPlug = () -> System.out.println("American Plug");

        EuropeanSocket europeanSocket = new EuropeanSocket();
        AmericanToEuropeanPlugAdapter adapter = new AmericanToEuropeanPlugAdapter(americanPlug);
        europeanSocket.plugIn(adapter);
    }

}
