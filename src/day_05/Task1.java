package day_05;

/**
 * Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(2012);
        car.setColour("silver");
        car.setModel("Subaru");
        System.out.println("Car " + car.getYearOfRelease() + " year of release");
        System.out.println("Her colour " + car.getColour());
        System.out.println("Her model " + car.getModel());
    }
}
