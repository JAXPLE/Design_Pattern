package B_Factory;

public class Latte extends Coffee {
    private String name;
    private int price;

    public Latte(String type, int price) {
        this.name = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
