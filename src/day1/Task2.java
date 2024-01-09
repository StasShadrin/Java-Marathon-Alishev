package day1;

/** Вывести на экран слово “​JAVA”​, в столбик, чтобы оно повторилось 10 раз,
 используя цикл на ваше усмотрение (​for​ или w​hile​).
 Вывод в консоль должен быть таким:
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 JAVA
 */
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println("JAVA ");
            count++;
        }

    }
}