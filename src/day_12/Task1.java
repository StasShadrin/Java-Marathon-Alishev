package day_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> brand = new ArrayList<>();
        brand.add("Audi");
        brand.add("Bmw");
        brand.add("Subaru");
        brand.add("Opel");
        brand.add("Lada");
        System.out.println(brand);
        brand.add(2,"Uaz");
        System.out.println(brand);
        brand.remove(0);
        System.out.println(brand);
    }
}
