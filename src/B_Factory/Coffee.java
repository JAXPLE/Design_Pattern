package B_Factory;

public abstract class Coffee {
    public abstract String getName();
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi " + getName() + " Coffee is " + this.getPrice();
    }
}
