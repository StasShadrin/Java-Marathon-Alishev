package day_09.task2;

public class Circle extends Figure{
    private double radiusOfCircle;

    public Circle(String color, double radiusOfCircle) {
        super(color);
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radiusOfCircle,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radiusOfCircle;
    }
}
