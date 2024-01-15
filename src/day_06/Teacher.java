package day_06;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomScore = random.nextInt(4) + 2;
        String score = "";
        switch (randomScore) {
            case 2 -> score = "неудовлетворительно";
            case 3 -> score = "удовлетворительно";
            case 4 -> score = "хорошо";
            case 5 -> score = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + score + ".");
    }
}
