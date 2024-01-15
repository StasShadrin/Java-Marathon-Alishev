package day_07;

/**
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 * дня.
 * В классе Самолет создать статический метод compareAirplanes, который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Airplane tu144 = new Airplane("Tu_144", 1968, 65,125_000);
        Airplane tu160 = new Airplane("Tu_160", 1984, 54, 110_000);
        Airplane.compareAirplanes(tu144,tu160);
    }
}
