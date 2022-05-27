package Strategy;

public class BPayStrategy implements PaymentStrategy {

    private String email;
    private String password;
    private Currency currency;

    public BPayStrategy(String email, String pwd, Currency currency) {
        this.email = email;
        this.password = pwd;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " " + currency.toString() + " paid using BPay ");
    }

}
