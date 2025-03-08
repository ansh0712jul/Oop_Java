package lec1;
public class Person {
    String name = " Anish ";
    int age = 20;

    public void display() {
        System.out.println("Name: " + name + " age : " + age);
    }

    // parameterised constructor
    public Person(int age , String name) {
        this.age = age ;
        this.name = name;
    }
    // non parameterised constructor
    public Person(){

    }
}
