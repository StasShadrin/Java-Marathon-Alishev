package day_05;

/**
 * Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(1990, "green", "jawa");
        System.out.println(moto.getYear());
        System.out.println(moto.getColour());
        System.out.println(moto.getModel());
    }
}
