package Inheritance;

public class TestPantagon {

    public static void main(String[] args) {
        Pantagon pantagon = new Pantagon(10, "green", true);
        System.out.println("Perimeter: " + pantagon.getPerimeter());
        System.out.println("Apothem: " + pantagon.getApothem());
        System.out.println("Area: " + pantagon.getArea());
        System.out.println("Count: " + pantagon.getCount());

        Pantagon pantagon2 = new Pantagon(10, 5);
        System.out.println("Perimeter: " + pantagon2.getPerimeter());
        System.out.println("Apothem: " + pantagon2.getApothem());
        System.out.println("Area: " + pantagon2.getArea());
        System.out.println("Count: " + pantagon2.getCount());

    }

}
