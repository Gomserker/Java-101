//if문 사용
		/*
		 * 1. 상품등록 2. 상품검색 3. 상품삭제 4. 종료
		 * 
		 * 작업을 선택하세요:  //(사용자가 여기 입력)
		 * 
		 * 1번 입력하면 '등록합니다.' 출력, 2번이면 '검색합니다.' -> 품명 : (입력받기) (기능구현 필요x)
		 * 
		 * 3번 입력하면 '삭제합니다' 출력
		 * 
		 * 4번 입력하면 프로그램 종료
		 * 
		 * 그외 번호 입력시 '입력 오류' 출력
		 * 
		 * 기능 구현은 하지 않고 형태만 제작.
		 */

import java.util.Scanner;

public class GoodsManagementTest {
	public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
		
		System.out.printf("1. 상품등록\t2. 상품검색\t3. 상품삭제\t4. 종료\n");
		System.out.println("============================================================="); // 위 항목은 최대한 유지되도록
		
		while (true) {
		System.out.print("작업을 선택하세요: ");
		int work = input.nextInt();
		
		if (work == 1) {
			System.out.println("상품을 등록합니다.");
		} else if (work == 2) {
			System.out.println("상품을 검색합니다.");
			System.out.print("품명을 입력하세요: ");
			String productName = input.next();
		} else if (work == 3) {
			System.out.println("상품을 삭제합니다.");
		} else if (work == 4) {
			System.out.println("시스템을 종료합니다.");
			break; // 4(종료)를 입력했을 때만 반복문이 종료되도록.
		} else {
			System.out.println("입력 오류");
		}
		
		}
	}
}
