package day_02;

/**
 * Реализовать программу №2, используя цикл while.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a + 1;
        if (a < b){
            while (i < b){
                if (i % 5 == 0 && i % 10 != 0){
                    System.out.print(i + " ");
                }
                i++;
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
