/*
* 정수 두개를 받은뒤 큰 값에서 작은 값을 출력하는 프로그램을 만들어보세요.
*
* [Test case 1]
*첫번째 정수를 입력하세요: 30
*두번째 정수를 입력하세요: 20
*30에서 20를 뺀 값은 10 입니다.
*
*[Test case 2]
*첫번째 정수를 입력하세요: 20
*두번째 정수를 입력하세요: 40
*40에서 20를 뺀 값은 20 입니다.
*/

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y, answer;
		
		System.out.print("첫번째 정수를 입력하세요: ");
		x = input.nextInt();
		
		System.out.print("두번째 정수를 입력하세요: ");
		y = input.nextInt();
		
		if (x > y) {
			System.out.printf("%d에서 %d를 뺀 값은 %d 입니다.", x, y, x-y);
		}
		else {
			System.out.printf("%d에서 %d를 뺀 값은 %d 입니다.", y, x, y-x);
		}

		
		//if-else가 아닌 삼항 연산자를 사용했을때.
//		int x, y, resSmaller, resBigger;
//		
//		System.out.print("첫 번째 정수를 입력하시오: ");
//		x = input.nextInt();
//		
//		System.out.print("두 번째 정수를 입력하시오: ");
//		y = input.nextInt();
//		
//		resBigger = (x > y) ? x : y; // x보다 y가 큰 지를 보고, 크다면 x를 출력, y가 크다면 y를 출력(둘 중 큰걸 뱉어냄)
//		resSmaller = (x > y) ? y : x; // x보다 y가 큰 지를 보고, 크다면 y를 출력, 작다면 x를 출력 (둘 중 작은걸 뱉어냄) 
//		
//		System.out.println(resBigger + "에서 " + resSmaller + "을 뺀 값은 " + (resBigger - resSmaller) + "입니다.");
		
	}
}
