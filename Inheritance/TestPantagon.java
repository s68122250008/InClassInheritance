package Inheritance;

public class TestPantagon {

    public static void main(String[] args) {
        Pantagon pantagon = new Pantagon(10, 5);
        System.out.println("Perimeter: " + pantagon.getPerimeter());
        System.out.println("Apothem: " + pantagon.getApothem());
        System.out.println("Area: " + pantagon.getArea());

    }

}
