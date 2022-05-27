package Strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    private Currency currency;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate, Currency currency) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " " + currency.toString() + " paid with credit/debit card");
    }

}
