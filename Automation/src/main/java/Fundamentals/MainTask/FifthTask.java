package Fundamentals.MainTask;


import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        System.out.println("Введите целое число от 1 до 12 и будет Вам месяц:");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfMonth = scanner.nextInt();
            if ((numberOfMonth > 0 && numberOfMonth <= 12)) {
                System.out.println(months[numberOfMonth - 1]);
            } else {
                System.out.println("Вы ввели не то число, попробуйте ещё раз");
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число, попробуйте ещё раз");
        }
        scanner.close();
    }
}














