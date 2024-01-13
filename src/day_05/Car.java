package day_05;

public class Car {
    private int yearOfRelease;
    public void setYearOfRelease(int yearOfRelease) {
        if (yearOfRelease < 1){
            System.out.println("Incorrect input year");
        } else {
            this.yearOfRelease = yearOfRelease;
        }
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }

    private String colour;
    public void setColour(String colour){
        if(colour.isEmpty()) {
            System.out.println("This is an empty input");
        } else {
            this.colour = colour;
        }
    }
    public String getColour(){
        return colour;
    }

    private String model;
    public void setModel(String model){
        if(colour.isEmpty()) {
            System.out.println("This is an empty input");
        } else {
            this.model = model;
        }
    }
    public String getModel(){
        return model;
    }
}
