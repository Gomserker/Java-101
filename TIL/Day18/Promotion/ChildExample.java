package Promotion;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		//Child 타입의 child 변수 생성
		
		Parent parent = child; // but, 자동 타입 변환 실행 (Child to Parent)
		parent.method1();
		parent.method2();
		
		System.out.println(parent == child);
//		parent.method3(); // 호출 불가능
		
		/*
		 * Child 객체는 method3() 메소드를 가지고 있지만, Parent 타입으로 변환된 이후엔 하위 클래스에만 있는 method3()를 호출할 수 없다.
		 * but, method2() 메소드는 Parent와 Child가 전부 가지고 있으므로 호출할 수 있다.
		 * but, 하위 클래스인 Child에서 Override 됐으므로 Child의 method2() 메소드가 호출된다.
		 * 
		 */
	}
}
