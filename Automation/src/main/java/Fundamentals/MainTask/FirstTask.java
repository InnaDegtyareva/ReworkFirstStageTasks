package Fundamentals.MainTask;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.println("Приветствую Вас, " + name + "!");
        scanner.close();
    }
}