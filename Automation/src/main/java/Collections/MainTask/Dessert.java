package Collections.MainTask;

public class Dessert {
    private String name;
    private int weight;
    private double sugarQuantity;
    private double price;

    public Dessert(String name, int weight, double sugarQuantity, double price) {
        this.name = name;
        this.weight = weight;
        this.sugarQuantity = sugarQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getSugarQuantity() {
        return sugarQuantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarQuantity=" + sugarQuantity +
                ", price=" + price;
    }
}

