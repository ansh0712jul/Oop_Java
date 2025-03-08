package lec1;


public class Student {
    String name; // data memeber of a class 
    int age;// data member of a class

    public void Intro_to_yourself(){ // method of a class
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public void Sayhello(String name){ 
        System.out.println(name + " say hello to " + this.name);
    }

    // static method works as common for all objects of a class

    public static void fun(){
        System.out.println("this is a static method");
    }

    static {
        System.out.println("this is first static block");
    }
}
