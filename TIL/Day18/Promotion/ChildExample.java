package Promotion;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		//Child Ÿ���� child ���� ����
		
		Parent parent = child; // but, �ڵ� Ÿ�� ��ȯ ���� (Child to Parent)
		parent.method1();
		parent.method2();
		
		System.out.println(parent == child);
//		parent.method3(); // ȣ�� �Ұ���
		
		/*
		 * Child ��ü�� method3() �޼ҵ带 ������ ������, Parent Ÿ������ ��ȯ�� ���Ŀ� ���� Ŭ�������� �ִ� method3()�� ȣ���� �� ����.
		 * but, method2() �޼ҵ�� Parent�� Child�� ���� ������ �����Ƿ� ȣ���� �� �ִ�.
		 * but, ���� Ŭ������ Child���� Override �����Ƿ� Child�� method2() �޼ҵ尡 ȣ��ȴ�.
		 * 
		 */
	}
}
