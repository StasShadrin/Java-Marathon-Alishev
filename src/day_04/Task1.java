package day_04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10
 * Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moreEight = 0;
        int equalOne = 0;
        int evenNumbers = 0;
        int unevenNumbers = 0;
        int total = 0;
        System.out.println("Введите число: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] > 8) {
                moreEight++;
            }
            if (arr[i] == 1) {
                equalOne++;
            }
            if (arr[i] % 2 == 0) {
                evenNumbers++;
            } else {
                unevenNumbers++;
            }
            total += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + unevenNumbers);
        System.out.println("Сумма всех элементов массива: " + total);
    }
}
