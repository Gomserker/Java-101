public class Car {
//field
String company = "Hyundai"; //이렇게 클래스의 필드에서 초기화를 선언하면 해당 클래스에서 생성되는 모든 Car 객체의 제조사는 Hyundai로 고정된다.
String model;
String color;
int maxSpeed;

//constructor
Car() {} // 기본 생성자 형태의 생성자 ①
Car(String model) { //model을 매개변수로 받는 형태의 생성자 ②
  this.model = model;
 }
Car(String model, String color) {
  this.model = model;
  this.color = color;
 }
Car(String model, String color, int maxSpeed) {
  this.model = model;
  this.color = color;
  this.maxSpeed = maxSpeed;
 }
} 
