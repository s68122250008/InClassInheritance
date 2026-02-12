package Inheritance;

public class Pantagon {

    private double perimeter;
    private double apothem;

    public Pantagon() {
    }

    public Pantagon(double perimeter, double apothem) {
        this.perimeter = perimeter;
        this.apothem = apothem;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getApothem() {
        return apothem;
    }

    public double setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        return perimeter;
    }

    public double setApothem(double apothem) {
        this.apothem = apothem;
        return apothem;
    }

    public double getArea() {
        return (perimeter * apothem) / 2;
    }
}
