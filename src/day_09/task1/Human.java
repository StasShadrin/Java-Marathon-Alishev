package day_09.task1;

public class Human {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + this.name);
    }
}
