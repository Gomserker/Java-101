package Promotion;

class A{}

//��� �躸
//1. A �� B �� D
//2. A �� C �� E

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
		
		//D�� ���� �躸�̹Ƿ� D ��ü�� B�� A�� promotion�� �����ϰ�, E�� C�� A�� �����ϴ�.
		B b1 = d;
		C c1 = e;
		
		//��� �躸
		//1. A �� B �� D
		//2. A �� C �� E
		
//		B b3 = e;
//		C c2 = d;
		
		// ������, D�� C��, B�� E�δ� �� �� ����. ��� ���谡 �ƴϱ� ����.
	}
}
