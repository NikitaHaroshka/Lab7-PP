package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Выберите порядок сортировки: (1 - возрастание, 2 - убывание)");
        int sortOrder = scanner.nextInt();

        Sort sortThread = new Sort(array, sortOrder);
        sortThread.start();

        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}