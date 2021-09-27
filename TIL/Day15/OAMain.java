
public class OAMain {
	public static void main(String[] args) {
		
		//영웅 -> 굉장히 추상적인 개념
		
		// 공격 기능 void attack();은 강제.
		// 영웅이라면 다 공격이 가능해야 한다.
		
		//슈퍼맨
		SuperMan superman = new SuperMan("슈퍼맨");
		superman.attack();
		
		//아이언맨
		IronMan ironman = new IronMan("아이언맨");
		ironman.attack();
		//헐크
		
		Hulk hulk = new Hulk("헐크");
		hulk.attack();
		
	}
}
