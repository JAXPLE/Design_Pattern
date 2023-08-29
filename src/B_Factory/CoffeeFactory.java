package B_Factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type, int price) {

        if ("Latte".equalsIgnoreCase(type))
            return new Latte(type, price);

        if ("Americano".equalsIgnoreCase(type))
            return new Americano(type, price);

        return new DefaultCoffee();
    }
}
