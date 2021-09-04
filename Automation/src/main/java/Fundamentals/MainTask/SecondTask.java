package Fundamentals.MainTask;

import java.lang.StringBuilder;

public class SecondTask {
    public static void main(String[] args) {
        String string = "Приветствую Вас, Инна!";
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String stringReverse = builder.toString();
        System.out.println("Обычная строка: " + string);
        System.out.println("Строка в обратном порядке: " + stringReverse);
    }
}

