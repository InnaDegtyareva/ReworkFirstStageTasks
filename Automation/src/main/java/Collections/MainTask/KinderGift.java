package Collections.MainTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KinderGift {
    private List<Dessert> newYearGift;

    public KinderGift(List<Dessert> newYearGift) {
        this.newYearGift = newYearGift;
    }


    public void sortByMaxPriceRub() {
        Comparator<Dessert> comparator = Comparator.comparing(obj -> obj.getPrice());
        newYearGift.sort(comparator);
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Dessert dessert : newYearGift) {
            int weight = dessert.getWeight();
            totalWeight += weight;
        }
        return totalWeight;
    }

    public List<Dessert> getSugarQuantityRange(int middleSugarQuantity) {
        List<Dessert> sugarQuantity = new ArrayList<>();
        for (Dessert dessert : newYearGift) {
            if (dessert.getSugarQuantity() > middleSugarQuantity) {
                sugarQuantity.add(dessert);
            }
        }
        return sugarQuantity;
    }
}

