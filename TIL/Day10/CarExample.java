public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();
    
    myCar.setGas(5); //Car 클래스의 setGas() 메소드 호출
    
    boolean gasState = myCar.isLeftGas(); //Car 클래스의 isLeftGas() 메소드 호출
    if(gasState) {
      System.out.println("출발합니다.");
      myCar.run(); // Car 클래스의 run() 메소드 호출
    }
    
    /*
     boolean isLeftGas() {
    if(gas==0) {
      System.out.println("gas가 없습니다.");
      return false;
    }
    System.out.println("gas가 있습니다.");
    return true;
  }
  
  isLeftGas() 메소드는 boolean 타입의 메소드이다.
  */
    
    
    if(myCar.isLeftGas()) {
      System.out.println("gas를 주입할 필요가 없습니다.");
    } else {
      System.out.println("gas를 주입하세요.");
    }
  }
}
