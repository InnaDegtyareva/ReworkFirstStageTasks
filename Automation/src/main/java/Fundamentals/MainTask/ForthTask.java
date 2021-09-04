package Fundamentals.MainTask;

import java.util.Scanner;

public class ForthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Сумма введенных чисел: " + (num1 + num2 + num3));
        System.out.println("Произведение введенных чисе: " + num1 * num2 * num3);
        scanner.close();
    }
}

