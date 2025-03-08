public class Car {
    private String color;
    private int price;
    private int speed;

    public Car(int price , int speed , String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) throws Exception  {
        if(price < 0){
            throw new Exception("bklol price kabhi -ve nhi hoyi h ");
        } 
        this.price = price;
    }
    public void setSpeed(int speed) {

        try {
            if(speed < 0) {

                throw new  Exception("bklol speed kabhi -ve nhi hoti h ");
            }
            this.speed = speed;
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    public int getSpeed() {
        return speed;
    }

    public void display_Car(){
        System.out.println("Price: "  + price + " Rs. " + " Speed: " + speed  + " Km/h " + " Color: " + color);
    }

}
