interface Coffee {
	void name();
	
	void price();
	
	default void hotOrIced() {
		System.out.println("물어봐야 하나?");
	}; //default 키워드를 붙이면 body를 사용할 수 있게된다.
}
	
	

class Espresso implements Coffee{
	
	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	
	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CaffeLatte implements Coffee{
	
	@Override
	public void name() {
		System.out.println("카페라테");
	}
	
	@Override
	public void price() {
		System.out.println("3000원");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("따뜻한거? 아이스?");
	}
}

class VanillaLatte implements Coffee{
	
	@Override
	public void name() {
		System.out.println("바닐라 라테");
	}
	
	@Override
	public void price() {
		System.out.println("3500원");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("따뜻한거? 아이스?");
	}
}

class Frappuccino implements Coffee{
	
	@Override
	public void name() {
		System.out.println("프라푸치노");
	}
	
	@Override
	public void price() {
		System.out.println("4000원");
	}
}

public class OIMain {
	public static void main(String[] args) {
		
		Coffee coffee;
		
		coffee = new Espresso();
		coffee.name();
		coffee.price();
		System.out.println("-------------");
		coffee = new CaffeLatte();
		coffee.name();
		coffee.price();
		System.out.println("-------------");
		coffee = new VanillaLatte();
		coffee.name();
		coffee.price();
		System.out.println("-------------");
		
		
//		//인터페이스도 추상화된 개념이라 객체를 만들 수 없음
//		Espresso espresso = new Espresso();
//		espresso.name();
//		espresso.price();
//		System.out.println("----------------------------");
//		CaffeLatte caffelatte = new CaffeLatte();
//		caffelatte.name();
//		caffelatte.price();
//		caffelatte.hotOrIced();
//		System.out.println("----------------------------");
//		VanillaLatte vanillaLatte = new VanillaLatte();
//		vanillaLatte.name();
//		vanillaLatte.price();
//		vanillaLatte.hotOrIced();
//		System.out.println("----------------------------");
//		Frappuccino frappuccino = new Frappuccino();
//		frappuccino.name();
//		frappuccino.price();
//		System.out.println("----------------------------");
//		//커피
//		
//		//에스프레소
//		
//		//카페라떼
//		
//		//바닐라라떼
//		
//		//프라푸치노
		
	}
}
