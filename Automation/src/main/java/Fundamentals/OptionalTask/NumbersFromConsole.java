package Fundamentals.OptionalTask;

import java.util.Scanner;

public class NumbersFromConsole {
    public static void main(String[] args) {
        int[] numbersArray = getNumbersFromConsole();
        String[] stringArray = getStringArrayFromIntArray(numbersArray);
        getLongestNumber(stringArray);
        getShortestNumber(stringArray);
        getSortedByLong(stringArray);
    }

    public static int[] getNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int quantityOfNumbers = scanner.nextInt();
        int[] numbersArray = new int[quantityOfNumbers];
        int i;
        System.out.println("Введите числа:");
        for (i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        scanner.close();
        return numbersArray;
    }

    public static String[] getStringArrayFromIntArray(int[] intArray) {
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            String el = String.valueOf(intArray[i]);
            stringArray[i] = el;
        }
        return stringArray;
    }

    public static void getLongestNumber(String[] stringArray) {
        String numberMaxLong = stringArray[0];
        int maxLong = stringArray[0].length();
        for (int j = 0; j < stringArray.length; j++) {
            if (stringArray[j].length() > maxLong) {
                maxLong = stringArray[j].length();
                numberMaxLong = stringArray[j];
            }
        }
        System.out.println("Самое длинное число:" + numberMaxLong + " Его длина:" + maxLong);
    }

    public static void getShortestNumber(String[] stringArray) {
        String numberMinLong = stringArray[0];
        int minLong = stringArray[0].length();
        for (int j = 0; j < stringArray.length; j++) {
            if (stringArray[j].length() < minLong) {
                minLong = stringArray[j].length();
                numberMinLong = stringArray[j];
            }
        }
        System.out.println("Самое короткое число:" + numberMinLong + " Его длина:" + minLong);
    }

    public static void getSortedByLong(String[] stringArray) {
        for (int j = stringArray.length - 1; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                if (stringArray[k].length() > stringArray[k + 1].length()) {
                    String numberLongerThanNext = stringArray[k];
                    stringArray[k] = stringArray[k + 1];
                    stringArray[k + 1] = numberLongerThanNext;
                }
            }
        }
        System.out.println("Числа в порядке возрастания значения их длин:");
        for (String number : stringArray)
            System.out.println(number);
    }
}
