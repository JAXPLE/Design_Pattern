package C_Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void removeItem(Item item) {
        cart.remove(item);
    }

    public int calculateTotal() {
        return cart.stream()
                .mapToInt(Item::getPrice)
                .sum();
    }

    public void pay(Payment payment) {
        payment.pay(calculateTotal());
    }
}
