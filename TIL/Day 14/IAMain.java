
public class IAMain {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		
		//��� = �̸�, ����, �ڱ�Ұ�(�������)
		//����, 30, �ڱ�Ұ�
		
		h1.name="����";
		h1.age=30;
		
		h1.info();
		System.out.println("-----------------");
		//�л� = �̸�, ����, �Ϻ��� ����
		//�ڱ�Ұ� ���
		
		Student student = new Student();
		student.name = "�ǿ�";
		student.age = 20;
		student.jpScore = 99;
		student.info();
		
		//������ = �̸�, ����, ������
		//mz, 27, java
		//�ڱ�Ұ� �� ����
		System.out.println("-----------------");
		Professor professor = new Professor();
		professor.name = "mz";
		professor.age = 27;
		professor.subject = "java";
		
		professor.info();
	}
}
