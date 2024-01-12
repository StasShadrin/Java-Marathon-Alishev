package day_04;

import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int sumMax = 0;
        int index = 0;
        for (int i = 1; i < array.length - 1 ; i++) {
            int sum = array[i - 1] + array[i] + array[i + 1];
            if(sum > sumMax){
                sumMax = sum;
                index = i - 1;
            }
        }
        System.out.println("Сумма: " + sumMax + " индекс: " + index);

    }
}
