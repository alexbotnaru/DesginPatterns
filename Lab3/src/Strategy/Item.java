package Strategy;

public class Item {

    private String code;
    private double price;

    public Item(String code, double cost) {
        this.code = code;
        this.price = cost;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

}
