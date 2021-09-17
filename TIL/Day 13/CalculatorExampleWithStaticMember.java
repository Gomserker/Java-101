package wiki;

public class CalculatorExampleWithStaticMember {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * CalculatorWithStaticMember.pi; //���� �ʵ��� pi�� ȣ���� ��
		int result2 = CalculatorWithStaticMember.plus(10, 5);
		int result3 = CalculatorWithStaticMember.minus(10, 5);
		
		System.out.printf("result1: %.3f\n", result1);
		System.out.printf("result2: %d\n", result2);
		System.out.printf("result3: %d\n", result3);
		
		System.out.println("---------------------------");
		
		CalculatorWithStaticMember cal1 = new CalculatorWithStaticMember();
		
		double result4 = 10 * 10 * cal1.pi;
		int result5 = cal1.plus(10, 5);
		int result6 = cal1.minus(10, 5);
		//�̷��� ����Ҽ��� ������ �����ϸ� ���������� �ƴ� Ŭ�������� ����� ȣ���ϵ��� ����.
		
		System.out.printf("result4: %.3f\n", result4);
		System.out.printf("result5: %d\n", result5);
		System.out.printf("result6: %d\n", result6);
	}
}
