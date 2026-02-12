package Inheritance;

public class Pantagon extends GeometricObject1 {

    private double perimeter;
    private double apothem;
    private static int count;

    public Pantagon() {
        ++count;
    }

    public Pantagon(double perimeter, double apothem) {
        this.perimeter = perimeter;
        this.apothem = apothem;
    }

    public Pantagon(double perimeter,
            String color, boolean filled) {
        this.perimeter = perimeter;
        setColor(color);
        setFilled(filled);
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        return perimeter;
    }

    public double getApothem() {
        return this.apothem;
    }

    public double setApothem(double apothem) {
        this.apothem = apothem;
        return apothem;
    }

    public double getArea() {
        return (perimeter * apothem) / 2;
    }
}
