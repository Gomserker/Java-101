interface Coffee {
	void name();
	
	void price();
	
	default void hotOrIced() {
		System.out.println("������� �ϳ�?");
	}; //default Ű���带 ���̸� body�� ����� �� �ְԵȴ�.
}
	
	

class Espresso implements Coffee{
	
	@Override
	public void name() {
		System.out.println("����������");
	}
	
	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CaffeLatte implements Coffee{
	
	@Override
	public void name() {
		System.out.println("ī�����");
	}
	
	@Override
	public void price() {
		System.out.println("3000��");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("�����Ѱ�? ���̽�?");
	}
}

class VanillaLatte implements Coffee{
	
	@Override
	public void name() {
		System.out.println("�ٴҶ� ����");
	}
	
	@Override
	public void price() {
		System.out.println("3500��");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("�����Ѱ�? ���̽�?");
	}
}

class Frappuccino implements Coffee{
	
	@Override
	public void name() {
		System.out.println("����Ǫġ��");
	}
	
	@Override
	public void price() {
		System.out.println("4000��");
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
		
		
//		//�������̽��� �߻�ȭ�� �����̶� ��ü�� ���� �� ����
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
//		//Ŀ��
//		
//		//����������
//		
//		//ī���
//		
//		//�ٴҶ��
//		
//		//����Ǫġ��
		
	}
}
