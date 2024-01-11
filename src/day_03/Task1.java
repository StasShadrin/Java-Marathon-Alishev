package day_03;

import java.util.Scanner;

/**
 * Реализовать программу, которая в консоль выводит название страны, принимая на
 * вход название города. Программа должна работать до тех пор, пока не будет введено
 * слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия
 * Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия
 * Берлин, Мюнхен, Кёльн - Германия
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название города: ");
            String city = sc.next();
            if (city.equals("Stop")) {
                System.out.println("*программа завершила работу*");
                break;
            }
            switch (city) {
                case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
                case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}
