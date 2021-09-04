package Collections.MainTask;

public class Candy extends Dessert {

    private String topping;

    public String getTopping() {
        return topping;
    }

    public Candy(String name, int weight, double sugarQuantity, double price, String topping) {
        super(name, weight, sugarQuantity, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", topping='" + topping + "'}";
    }
}
