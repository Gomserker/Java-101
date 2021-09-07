public class BMIMain {
	public static void main(String[] args) throws InterruptedException {
		// BMI 뱉어내는 프로그램
		
		//1. 필요한 변수 : 이름, 키, 체중
		//2. 계산식 : The formula is BMI = kg/m2
		// 18.5 이하면 저체중 / 18.5~22.9 정상 / 23.0~24.9 과체중 / 25.0 이상 비만.
		// 
		//3. 판정 : 지수 몇 이상은 고도 비만, 몇 이상은 비만, 몇 이상은 과체중 어쩌고 저쩌고...
		//4. BMI : ㅇㅇ.ㅇㅇ / ㅇㅇㅇ 님, 당신은 'ㅇㅇ' 입니다.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사용자의 이름을 입력하세요: ");
		String name = input.next();
		
		System.out.print(name + "님의 몸무게를 입력하세요(단위:kg): ");
		double weight = input.nextDouble();
		
		System.out.print(name + "님의 키를 입력하세요: ");
		double height = input.nextDouble();
		
		//m/cm 둘다 되게
		if(height > 10) { //현실적으로 키가 10m를 넘는 사람은 없으므로, 입력되는 실수가 10을 넘어가면 cm로 판단.
			height /= 100; //cm를 m로 전환.
    }
    
    double bmi = weight / (height * height); // BMI fomula 에서 키를 cm 단위로 입력해도, m 단위로 입력해도 전부 적용되게 하기 위해 위에서 height에 조건을 부여했다.
      
    String result = "비만";
		
    //
		if (bmi < 20) {
			result = "저체중";
		} else if (bmi < 25) {
			result = "정상";
		} else if (bmi < 30){
			result = "과체중";
		}
		// 위처럼 변수를 설정하는 것에 익숙해질 필요가 있다.
    
		System.out.print("계산중.");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".\n");

		Thread.sleep(1000);
    
    // 실행에 딜레이를 주는 메서드다.
    // public static void main(String[] args) 메인 구문에 "throws InterruptedException" 을 추가하여 사용할 수 있다.
    // 대기시간 1000 = 1초.
    
    System.out.printf("bmi 수치: %.2f\n",bmi);
		System.out.printf("%s님, 당신은 %s입니다.\n", name, result);
		
		input.next();
		
	}
}
