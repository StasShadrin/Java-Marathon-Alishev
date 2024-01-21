package day_12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания). Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
 * Перемешать список. Создать статический метод в классе Task3:
 *       public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года.
 * Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
 * Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */

public class Task3 {
    public static void main(String[] args) {
        MusicBand group1 = new MusicBand("Кино", 1981);
        MusicBand group2 = new MusicBand("Король и шут", 1988);
        MusicBand group3 = new MusicBand("Пикник", 1978);
        MusicBand group4 = new MusicBand("Смысловые Галлюцинации", 1989);
        MusicBand group5 = new MusicBand("Ария", 1985);
        MusicBand group6 = new MusicBand("Louna", 2008);
        MusicBand group7 = new MusicBand("Слот", 2002);
        MusicBand group8 = new MusicBand("Lumen", 1998);
        MusicBand group9 = new MusicBand("Amatory", 2014);
        MusicBand group10 = new MusicBand("Stigmata", 2003);
        MusicBand group11 = new MusicBand("Wildways", 2009);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(group1);
        musicBands.add(group2);
        musicBands.add(group3);
        musicBands.add(group4);
        musicBands.add(group5);
        musicBands.add(group6);
        musicBands.add(group7);
        musicBands.add(group8);
        musicBands.add(group9);
        musicBands.add(group10);
        musicBands.add(group11);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands)
            if (band.getYear() > 2000){
                groupsAfter2000.add(band);
            }
        return groupsAfter2000;
    }
}
