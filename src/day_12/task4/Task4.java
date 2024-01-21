package day_12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять участников.
 * Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B.
 * Название метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand. Реализовать метод printMembers (в классе MusicBand), выводящий список участников в консоль.
 * Проверить состав групп после слияния.
 */

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Честер Беннингтон");
        members1.add("Майк Шинода");
        members1.add("Джо Хан");
        members1.add("Брэд Дэлсон");
        members1.add("Роб Бурдон");
        members1.add("Дэвид Фаррелл");

        MusicBand musicBand1 = new MusicBand("Linkin Park", 1996, members1);

        musicBand1.printMembers();

        List<String> members2 = new ArrayList<>();
        members2.add("Бенджамин Бёрнли");
        members2.add("Кит Уоллен");
        members2.add("Джейсен Рау");
        members2.add("Аарон Брук");
        members2.add("Шон Фоист");

        MusicBand musicBand2 = new MusicBand("Breaking Benjamin", 1999, members2);

        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
