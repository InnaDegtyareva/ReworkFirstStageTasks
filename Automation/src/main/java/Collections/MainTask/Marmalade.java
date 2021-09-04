package Collections.MainTask;

public class Marmalade extends Dessert {
    private String sprinkling;

    public String getSprinkling() {
        return sprinkling;
    }

    public Marmalade(String name, int weight, double sugarQuantity, double price, String sprinkling) {
        super(name, weight, sugarQuantity, price);
        this.sprinkling = sprinkling;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", sprinkling='" + sprinkling + "'}";
    }
}
