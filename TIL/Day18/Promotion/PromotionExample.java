package Promotion;

class A{}

//상속 계보
//1. A ← B ← D
//2. A ← C ← E

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//D는 같은 계보이므로 D 객체는 B와 A로 promotion이 가능하고, E는 C와 A로 가능하다.
		B b1 = d;
		C c1 = e;
		
		//상속 계보
		//1. A ← B ← D
		//2. A ← C ← E
		
//		B b3 = e;
//		C c2 = d;
		
		// 하지만, D는 C로, B는 E로는 할 수 없다. 상속 관계가 아니기 때문.
	}
}
