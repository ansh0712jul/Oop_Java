package lec2_Inheritance;

public class Client {
    public static void main(String[] args) {
        
        Parent p = new Child();
        System.out.println(p.d);
        System.out.println(p.d1);
        System.out.println(((Child)(p)).d2); // type casting
        
    }
}
