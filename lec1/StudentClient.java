package lec1;
public class StudentClient {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student s1 =  new Student();
        s1.name = "John Doe";
        s1.age = 33;
        s1.Intro_to_yourself();
        Student s2 =  new Student();
        s2.name = "Jane Doe";
        s2.age = 32;
        s2.Intro_to_yourself();
        s2.Sayhello("johnny");
        // accessing a static method thorugh class name 
        Student.fun();

    }
}
