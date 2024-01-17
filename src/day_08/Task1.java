package day_08;

/**
 * Создать строку, состоящую из чисел от 0 до 20000 Важно понимать, что это одна
 * строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен
 * вывести в консоль сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией
 * обычных строк (класс String) и использовании StringBuilder, реализуйте
 * описанную задачу этими двумя способами, замеряя время работы программы.
 */
public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0");
        long before = System.currentTimeMillis();
        for (int i = 1; i <= 20_000; i++) {
            sb.append(" ").append(i);
        }
        long after = System.currentTimeMillis();
//        System.out.println(sb.toString());
        System.out.println("Время выполнения StrungBuilder " + (after - before));


        String str = "0";
        before = System.currentTimeMillis();
        for (int i = 1; i <= 20_000; i++) {
            str = str + " " + i;
        }
        after = System.currentTimeMillis();
        System.out.println("Время выполнения Strung " + (after - before));
//        System.out.print(str);
    }
}
