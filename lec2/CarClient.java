package lec2;
public class CarClient {
    
    public static void main(String[] args) throws Exception {
        
        Car c1 = new Car(2500 , 45 , "red");
        Car c2 = new Car(8700 , 58 , "black");
        c1.setColor("yellow");
        c1.setPrice(200);
        c1.setSpeed(-23);
        c1.display_Car();
        c2.display_Car();
    }
}
