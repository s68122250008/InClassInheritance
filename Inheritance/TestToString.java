package Inheritance;

public class TestToString {

    private String name;

    @Override
    public String toString() {
        return "created on " + name;
    }

    public TestToString() {

    }

    public TestToString(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestToString t1 = new TestToString("john");
        System.out.println(t1.toString());
    }
}
