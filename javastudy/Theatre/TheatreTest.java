package wiki;

import java.util.Scanner;

public class TheatreTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Theatre 생성자로 사이즈 15의 배열 생성.
		Theatre megabox = new Theatre(15);
		
		//y 또는 n 값을 입력받고 n이면 무한반복에서 탈출, y 또는 잘못된 값을 넣으면 반복
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (y or n)");
			String answer = input.next();
			if(answer.equals("y")) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				megabox.userInterface();
				megabox.reserve();
			} else if (answer.equals("n")) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("y 또는 n을 입력해주세요.");
			}
		}
		
	}
}
