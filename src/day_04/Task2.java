package day_04;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000
 * Затем, используя циклы for each вывести:
 *  - наибольший элемент массива
 *  - наимешиньй элемент массива
 *  - количество элементов массива, оканчивающихся на 0
 *  - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10_000);
        }
        int maxElement = arr[0];
        int minElement = arr[0];
        int quantityEndZero = 0;
        int sumEndZero = 0;
        for(int element: arr){
            if (element > maxElement){
                maxElement = element;
            }
            if (element < minElement){
                minElement = element;
            }
            if (element % 10 == 0) {
                quantityEndZero++;
                sumEndZero += element;
            }
        }
        System.out.println("наибольший элемент массива: " + maxElement);
        System.out.println("наимешиньй элемент массива: " + minElement);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + quantityEndZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEndZero);
    }
}
