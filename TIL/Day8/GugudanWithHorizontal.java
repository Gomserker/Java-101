//구구단의 각 단을 가로로 이어붙여 출력하는 프로그램을 만드세요
//example
//  2 x 1 = 2 | 3 x 1 = 3 | 4 x 1 = 4 |
//  2 x 2 = 4 | 3 x 2 = 6 | 4 x 2 = 8 |
// ...
//본격 머리가 나빠서 머리가 고생하는 코드
public class GugudanWithHorizontal {
	public static void main(String[] args) {
    
    int day;
    int month;
		//28일에서 끊음
			for (day = 1; day < 29; day++) {
				for (month = 1; month < 13; month++) {
					System.out.printf("%d월 %d일\t|\t", month, day);
			}
			System.out.println();
		}
			//29~30일 출력
			for (day = 29; day < 31; day++) {
				for (month = 1; month < 13; month++) {
					if (month == 2) {
						System.out.print("\t|\t");
					} else {
						System.out.printf("%d월 %d일\t|\t", month, day);
					}
			}
			System.out.println();
		}
			//31일 출력
			for (day = 31; day < 32; day++) {
				for (month = 1; month < 13; month++) {
					if ((month % 2 == 1 && month < 8) || (month % 2 == 0 && month > 7)) {
						System.out.printf("%d월 %d일\t|\t", month, day);
					} else {
						System.out.print("\t|\t");
					}
					
				}
			}
		
		
	}
}
