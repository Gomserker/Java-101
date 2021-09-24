
public class IAMain2 {
	public static void main(String[] args) {
		// - 필드 '직접' x -> 필드에 프라이빗 거시요
		// - 나중에 값 o -> 세터로 받아도 되요, 생성때 o -> 오버로딩으로 가능하오
		
		
		//컴퓨터 : 이름(상품명), 가격, 
		//cpu, ram, hdd
		//정보출력
		
		//볼펜 : 이름(상품명), 가격, 
		//컬러
		//정보출력
		
		//노트북 : 이름, 가격, 
		//무게, 배터리 용량
		//정보출력
		
		Computer computer = new Computer("i5-11970", 16, 256);
		computer.setName("iMac");
		computer.setCost(1200);
		computer.info();
		
		
//		슈퍼 클래스 필드가 전부 private이 걸려 있는데 상속이 안되어야 하는데 어떻게 값이 세팅이 될까?
		
		System.out.println("-------------------");
		
		BallPen ballpen = new BallPen();
		ballpen.setColor("red");
		ballpen.setName("Jetstream");
		ballpen.setCost(12);
		ballpen.info();
		
		System.out.println("--------------------");
		
		Laptop laptop = new Laptop(1.7, 11200);
		laptop.setName("MacBook 17inch");
		laptop.setCost(1199);
		laptop.info();
	}
}
