import java.util.*;

interface Coffee3 {
	void name();
	
	void price();
	
	default void hotOrIced() {
		System.out.println("��������ϳ�?");
		
	}; //default Ű���带 ���̸� body�� ����� �� �ְԵȴ�.
}
	
	

class Espresso3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("����������");
	}
	
	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CaffeLatte3 implements Coffee3{
	
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

class VanillaLatte3 implements Coffee3{
	
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

class Frappuccino3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("����Ǫġ��");
	}
	
	@Override
	public void price() {
		System.out.println("4000��");
	}
}



public class OIMain03 {
	public static void main(String[] args) {
		
//�ֿܼ� �ȳ�
		// �ֹ� �Ͻðھ��?
		// 1. ����������	2. ī��� 	3. �ٴҶ��	4. ����Ǫġ��	5. ���� �����... -> �׷� ������ (break;)
		//�� �� ��ȣ �Է½� > �޴��ǿ� ���׿�
		
		//2���̳� 3���� hot or ice �����
		//������ �޴� ���ý� �޴���, ���� ������ֱ�
		
		Scanner input = new Scanner(System.in);
		
		int answer;
		int select;
		
		
		
		while(true) {
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println("�ֹ� �Ͻðھ��?");
			System.out.println("1. ����������\t2. ī���\t3.�ٴҶ��\t4.����Ǫġ��\t5.���� �����...");
			System.out.println("------------------------------------------------------------------------------------------------------");
			answer = input.nextInt();
			
			Coffee3  coffee = null;
			
			if(answer == 1) {
				coffee = new Espresso3();
				System.out.println("--------------------------------");
				
				
			} else if (answer == 2) {
				coffee = new CaffeLatte3();
				System.out.println("--------------------------------");
				
				
			} else if (answer == 3) {
				coffee = new VanillaLatte3();
				System.out.println("--------------------------------");
				
				
			} else if (answer == 4) {
				coffee = new Frappuccino3();
				System.out.println("--------------------------------");
				
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
				continue;
			}
			
			if (answer == 2 || answer == 3) {
				coffee.hotOrIced();
				select = input.nextInt();
				System.out.println("--------------------------------");
				if (select == 1) {
					System.out.println("�����ϰ� �帱�Կ�");
				} else if (select == 2) {
					System.out.println("���̽��� �帱�Կ�");
				} else {
					System.out.println("����� ������");
				}
			}
			coffee.name();
			coffee.price();
			
			
		}
	}
}
