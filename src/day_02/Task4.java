package day_02;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса
 * Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить
 * значение y.
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод
 * nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = sc.nextDouble();
        double y = getValue(x);
        System.out.println(y);

    }
    static double getValue (double x){
        if (x >= 5){
            return ((x * x) - 10) / (x + 7);
        } else if (x > -3) {
            return (x + 3) * (x * x - 2);
        } else {
            return 420;
        }
    }
}
