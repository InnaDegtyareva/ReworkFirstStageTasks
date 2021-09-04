package Collections.MainTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Dessert alenka = new Candy("Алёнка", 13, 7.28, 0.56, "Вафля");
        Dessert belochka = new Candy("Белочка", 15, 9.66, 0.70, "Орехи");
        Dessert pchelka = new Marmalade("Пчёлка", 5, 3.98, 0.20,
                "Сахарная пудра");
        Dessert polechka = new Marmalade("Полечка", 20, 16.44, 0.90,
                "Кокос");
        Dessert duschess = new Lollipop("Дюшес", 7, 6.80, 0.42, "Груша");
        Dessert chypaChyps = new Lollipop("Чупа-чупс", 15, 13.86, 0.95,
                "Фруктовое желе");
        Dessert snickers = new ChocolateBar("Сникерс", 51, 29.99, 2.02,
                "Орехи");
        Dessert bounty = new ChocolateBar("Баунти", 55, 33.0, 1.98,
                "Кокос");

        ArrayList<Dessert> newYearGift = new ArrayList<>(Arrays.asList(alenka, belochka, pchelka, polechka,
                duschess, chypaChyps, snickers, bounty));

        KinderGift kinderGift = new KinderGift(newYearGift);
        kinderGift.sortByMaxPriceRub();

        System.out.println("Новогодний подарок состоит из следующих сладостей:");
        for (Dessert dessert : newYearGift)
            System.out.println(dessert);
        System.out.println("Общий вес: " + kinderGift.getTotalWeight() + " грамм");
        System.out.println("Список сладостей, где количество сахара превышает среднее значение (в граммах):");
        System.out.println(kinderGift.getSugarQuantityRange(15));
    }
}

