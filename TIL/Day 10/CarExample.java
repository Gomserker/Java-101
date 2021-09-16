public class CarExample {
  public static void main(String[] args) {
    
    Car myCar = new Car();
    
    //read the field
    System.out.println("manufacturer: " + myCar.company);
    System.out.println("model: " + myCar.model);
    System.out.println("color: " + myCar.color);
    System.out.println("maximum speed: " + myCar.maxSpeed);
    System.out.println("current speed: " + myCar.speed);
    
    myCar.speed = 60;
    System.out.println("changed speed: " + myCarspeed);
  }
}
