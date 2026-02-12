package Inheritance;

//  is - a relationship
// ===== คลาสแม่สุด =====
class Person {

    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

// ===== คลาสลูกของ Person =====
class Employee extends Person {

    // Constructor ปกติ
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");   
        System.out.println("(3) Performs Employee's tasks");
    }

    // Constructor แบบ Overload
    public Employee(String s) {
        System.out.println(s);
    }
}

// ===== คลาสลูกสุดท้าย =====
public class Faculty extends Employee {

    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }

    public static void main(String[] args) {
        new Faculty();
    }
}
