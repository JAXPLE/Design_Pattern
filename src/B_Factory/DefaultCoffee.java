package B_Factory;

public class DefaultCoffee extends Coffee{
    private String name;
    private int price;

    public DefaultCoffee() {
        this.name = "Default Coffee";
        this.price = -1;
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
