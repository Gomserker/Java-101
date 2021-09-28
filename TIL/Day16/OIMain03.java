import java.util.*;

interface Coffee3 {
	void name();
	
	void price();
	
	default void hotOrIced() {
		System.out.println("물어봐야하나?");
		
	}; //default 키워드를 붙이면 body를 사용할 수 있게된다.
}
	
	

class Espresso3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	
	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CaffeLatte3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("카페라테");
	}
	
	@Override
	public void price() {
		System.out.println("3000원");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("1. 따뜻하게\t2. 아이스");
		System.out.println("--------------------------------");
	}
}

class VanillaLatte3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("바닐라 라테");
	}
	
	@Override
	public void price() {
		System.out.println("3500원");
	}
	
	@Override
	public void hotOrIced() {
		System.out.println("1. 따뜻하게\t2. 아이스");
		System.out.println("--------------------------------");
	}
}

class Frappuccino3 implements Coffee3{
	
	@Override
	public void name() {
		System.out.println("프라푸치노");
	}
	
	@Override
	public void price() {
		System.out.println("4000원");
	}
}



public class OIMain03 {
	public static void main(String[] args) {
		
//콘솔에 안내
		// 주문 하시겠어요?
		// 1. 에스프레소	2. 카페라떼 	3. 바닐라라떼	4. 프라푸치노	5. 돈이 없어요... -> 그럼 가세요 (break;)
		//그 외 번호 입력시 > 메뉴판에 없네요
		
		//2번이나 3번은 hot or ice 물어보기
		//나머지 메뉴 선택시 메뉴명, 가격 출력해주기
		
		Scanner input = new Scanner(System.in);
		
		int answer;
		int select;
		
		
		
		while(true) {
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println("주문 하시겠어요?");
			System.out.println("1. 에스프레소\t2. 카페라떼\t3.바닐라라떼\t4.프라푸치노\t5.돈이 없어요...");
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
				System.out.println("그럼 가세요");
				System.out.println("--------------------------------");
				break;
			} else {
				System.out.println("--------------------------------");
				System.out.println("메뉴판에 없는 번호입니다.");
				System.out.println("--------------------------------");
				continue;
			}
			
			if (answer == 2 || answer == 3) {
				coffee.hotOrIced();
				select = input.nextInt();
				System.out.println("--------------------------------");
				if (select == 1) {
					System.out.println("따뜻하게 드릴게요");
				} else if (select == 2) {
					System.out.println("아이스로 드릴게요");
				} else {
					System.out.println("제대로 고르세요");
				}
			}
			coffee.name();
			coffee.price();
			
			
		}
	}
}
