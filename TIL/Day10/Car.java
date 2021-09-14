//return value가 없는 method(void)

public class Car {
  //field
  int gas;
  
  //constsructor
  
  //method
  //return value가 없는 메소드로 매개값을 받아서 gas의 필드 값을 변경하는 method.
  void setGas(int gas) {
    this.gas = gas;
  }
  
  //return type이 boolean인 메소드로 gas의 field value가 0이면 false를, 0이 아니면 true를 리턴한다.
  boolean isLeftGas() {
    if(gas==0) {
      System.out.println("gas가 없습니다.");
      return false;
    }
    System.out.println("gas가 있습니다.");
    return true;
  }
  
  //return value가 없는 메소드로 gas의 field value가 0보다 크면 gas에 -1을, 0이 되면 return; 문으로 메소드가 강제 종료된다.
  void run() {
    while (true) {
      if(gas > 0) {
        System.out.println("차가 달립니다. (gas 잔량: " + gas + ")");
        gas -= 1;
      } else {
        System.out.println("차가 멈춥니다. (gas 잔량: " + gas + ")");
        return;
      }
    }
  }
}
