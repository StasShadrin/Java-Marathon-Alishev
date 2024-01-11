package day_03;

import java.util.Scanner;

/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя
 * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 * результат деления и выводит его в консоль. Программа останавливает свою работу
 * тогда, когда пользователь вводит 0 в качестве делителя.
 * (для этих вещественных чисел необходимо использовать тип double и метод
 * nextDouble() у Scanner’а соответственно).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите первое число: ");
            double divisible = sc.nextDouble();
            System.out.println("Введите второе число: ");
            double divisor = sc.nextDouble();
            if (divisor == 0 ){
                System.out.println("На ноль делить нельзя!");
                break;
            }
            System.out.print("Результат: ");
            System.out.println(divisible + " / " + divisor + " = " + (divisible / divisor));
        }
    }
}
