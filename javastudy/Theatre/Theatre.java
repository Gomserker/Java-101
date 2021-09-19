package wiki;

import java.util.Scanner;

public class Theatre {
	int[] seats;
	int size;
	
	//�⺻ ������
	public Theatre() {}
	
	//���� �Ը� ��ǲ���� �޴� ������
	public Theatre(int size) {
		this.size = size;
		//�ڸ����� ���� �Ը�ŭ�� �迭
		seats = new int [size];
	}
	
	//�ڸ� ��Ȳ �������̽� ����ϴ� �޼ҵ�
	public void userInterface() {
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i = 1; i < size + 1; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n---------------------------------------------------------------------------------------");
		for (int i = 0; i < size; i++) {
			System.out.print(seats[i] + "\t");
		}
		System.out.println("\n---------------------------------------------------------------------------------------");
	}
	
	//�ڸ� ���� �޼ҵ�
	public void reserve() {
		while(true) {
			System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if (seats[number-1] == 0) {
				seats[number-1] = 1;
				System.out.println("�¼��� �����ϼ̽��ϴ�.");
				break;
			} else if (seats[number-1] == 1) {
				System.out.println("�̹� ����� �¼��Դϴ�.");
			} 
		}
		
	}
	
}
