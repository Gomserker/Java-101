import java.util.*;

interface Coffee2 {
	void name();
	
	void price();
	
	default void hotOrIced() {
		System.out.println("��������ϳ�?");
		
	}; //default Ű���带 ���̸� body�� ����� �� �ְԵȴ�.
}
	
	

class Espresso2 implements Coffee2{
	
	@Override
	public void name() {
		System.out.println("����������");
	}
	
	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CaffeLatte2 implements Coffee2{
	
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
		System.out.println("1. �����ϰ�\t2. ���̽�");
		System.out.println("--------------------------------");
	}
}

class VanillaLatte2 implements Coffee2{
	
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
		System.out.println("1. �����ϰ�\t2. ���̽�");
		System.out.println("--------------------------------");
	}
}

class Frappuccino2 implements Coffee2{
	
	@Override
	public void name() {
		System.out.println("����Ǫġ��");
	}
	
	@Override
	public void price() {
		System.out.println("4000��");
	}
}



public class OIMain02 {
	public static void main(String[] args) {
		
//�ֿܼ� �ȳ�
		// �ֹ� �Ͻðھ��?
		// 1. ����������	2. ī��� 	3. �ٴҶ��	4. ����Ǫġ��	5. ���� �����... -> �׷� ������ (break;)
		//�� �� ��ȣ �Է½� > �޴��ǿ� ���׿�
		
		//2���̳� 3���� hot or ice �����
		//������ �޴� ���ý� �޴���, ���� ������ֱ�
		
		Scanner input = new Scanner(System.in);
		
		Espresso2 espresso = new Espresso2();
		CaffeLatte2 caffelatte = new CaffeLatte2();
		VanillaLatte2 vanillaLatte = new VanillaLatte2();
		Frappuccino2 frappuccino = new Frappuccino2();
		
		int answer;
		int select;
		
		while(true) {
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println("�ֹ� �Ͻðھ��?");
			System.out.println("1. ����������\t2. ī���\t3.�ٴҶ��\t4.����Ǫġ��\t5.���� �����...");
			System.out.println("------------------------------------------------------------------------------------------------------");
			answer = input.nextInt();
			
			if(answer == 1) {
				System.out.println("--------------------------------");
				espresso.name();
				espresso.price();
				
			} else if (answer == 2) {
				System.out.println("--------------------------------");
				caffelatte.hotOrIced();
				select = input.nextInt();
				System.out.println("--------------------------------");
				if (select == 1) {
					System.out.println("�����ϰ� �帱�Կ�");
				} else if (select == 2) {
					System.out.println("���̽��� �帱�Կ�");
				} else {
					System.out.println("����� ������");
				}
				caffelatte.name();
				caffelatte.price();
				
			} else if (answer == 3) {
				System.out.println("--------------------------------");
				vanillaLatte.hotOrIced();
				select = input.nextInt();
				System.out.println("--------------------------------");
				if (select == 1) {
					System.out.println("�����ϰ� �帱�Կ�");
				} else if (select == 2) {
					System.out.println("���̽��� �帱�Կ�");
				} else {
					System.out.println("����� ������");
				}
				vanillaLatte.name();
				vanillaLatte.price();
			} else if (answer == 4) {
				System.out.println("--------------------------------");
				frappuccino.name();
				frappuccino.price();
				System.out.println("--------------------------------");
			} else if (answer == 5) {
				System.out.println("--------------------------------");
				System.out.println("�׷� ������");
				System.out.println("--------------------------------");
				break;
			} else {
				System.out.println("--------------------------------");
				System.out.println("�޴��ǿ� ���� ��ȣ�Դϴ�.");
				System.out.println("--------------------------------");
			}
			
		}
	}
}
