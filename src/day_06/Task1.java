package day_06;

/**
 * Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
 * в пакет текущего дня.
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 *     info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 *     yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(2010);
        car.setColour("red");
        car.setModel("bmw");
        car.getInfo();
        System.out.println(car.yearDifference(2010));
        Motorbike moto = new Motorbike(1990, "green", "jawa");
        moto.getInfo();
        System.out.println(moto.yearDifference(2024));
    }
}
