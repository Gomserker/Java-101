package wiki;

import java.util.Scanner;

public class Theatre {
	int[] seats;
	int size;
	
	//기본 생성자
	public Theatre() {}
	
	//극장 규모를 인풋으로 받는 생성자
	public Theatre(int size) {
		this.size = size;
		//자릿수는 극장 규모만큼의 배열
		seats = new int [size];
	}
	
	//자리 현황 인터페이스 출력하는 메소드
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
	
	//자리 예약 메소드
	public void reserve() {
		while(true) {
			System.out.print("몇 번째 좌석을 예약하시겠습니까?");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if (seats[number-1] == 0) {
				seats[number-1] = 1;
				System.out.println("좌석을 예약하셨습니다.");
				break;
			} else if (seats[number-1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
			} 
		}
		
	}
	
}
