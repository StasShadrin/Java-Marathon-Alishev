package day_09.task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double halfPerimeter(){
        return (this.a + this.b + this.c) / 2;
    }

    @Override
    public double area() {
        return Math.sqrt(halfPerimeter()*(halfPerimeter() - this.a) * (halfPerimeter() - this.b) * (halfPerimeter() - this.c));
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
