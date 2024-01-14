package day_06;

public class Motorbike {
    private int year;
    private String colour;
    private String model;

    public Motorbike(int year, String colour, String model) {
        this.year = year;
        this.colour = colour;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColour() {
        return colour;
    }
    public String getModel() {
        return model;
    }

    public void getInfo(){
        System.out.println("This is Motorbike");
    }

    public String yearDifference(int year){
        if (this.year > year){
            return "Less by: " + (this.year - year);
        } else if (this.year < year) {
            return "More on: " + (year - this.year);
        }
        return "0";
    }
}
