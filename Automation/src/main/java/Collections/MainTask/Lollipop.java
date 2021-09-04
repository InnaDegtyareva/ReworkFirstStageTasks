package Collections.MainTask;

public class Lollipop extends Dessert {
    private String topping;

    public String getTopping() {
        return topping;
    }

    public Lollipop(String name, int weight, double sugarQuantity, double price, String topping) {
        super(name, weight, sugarQuantity, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", topping='" + topping + "'}";
    }
}
