package Strategy;

public class Client {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 15.99D);
        Item item2 = new Item("5678", 40.5D);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new BPayStrategy("alex@tmps.com", "password", Currency.EUR));

        cart.pay(new CreditCardStrategy("Alexandru Botnaru", "1234567890123456", "786", "12/15", Currency.USD));
    }
}
