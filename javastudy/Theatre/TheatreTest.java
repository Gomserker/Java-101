package wiki;

import java.util.Scanner;

public class TheatreTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Theatre �����ڷ� ������ 15�� �迭 ����.
		Theatre megabox = new Theatre(15);
		
		//y �Ǵ� n ���� �Է¹ް� n�̸� ���ѹݺ����� Ż��, y �Ǵ� �߸��� ���� ������ �ݺ�
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (y or n)");
			String answer = input.next();
			if(answer.equals("y")) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				megabox.userInterface();
				megabox.reserve();
			} else if (answer.equals("n")) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("y �Ǵ� n�� �Է����ּ���.");
			}
		}
		
	}
}
