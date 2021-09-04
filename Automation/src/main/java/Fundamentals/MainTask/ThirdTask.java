package Fundamentals.MainTask;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре любых числа:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int forthNumber = scanner.nextInt();

        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " " + forthNumber);
        System.out.println(firstNumber + "\n" + secondNumber + "\n" + thirdNumber + "\n" + forthNumber);
    }
}

