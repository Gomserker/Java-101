class Car04{
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class GetterSetterPractice {
	public static void main(String[] args) {
			
		Car04 myCar1 = new Car04(); //실제 자동차를 생성(객체 생성)
		
		// 노랑, 0
		myCar1.setColor("Yellow");
		myCar1.setSpeed(120);
		// 색과 속도 전부 출력
		System.out.printf("color is %s\n", myCar1.getColor());
		System.out.printf("speed is %d\n", myCar1.getSpeed());
		
	}
}
