package org.example.Encapsulation;

public class Encapsulation {

    private int age;
    private String Name;

    public int getAge() {    // getters
        return age;
    }

    public void setAge(int age) {  // setters
        this.age = age;    // "This" keyword used to differentiate between the local variable and class variable. "This" keyword always belongs to Class variable.
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {

        Encapsulation m = new Encapsulation();
        m.setAge(30);
        System.out.println(m.getAge());
        m.setName("Vijay");
        System.out.println(m.getName());
    }

}
