//�κ����� ���迡 ������ is a ����, ��Ӱ��� ����
public class Student extends Human{
	//�̸�, ����, �Ͼ�����
	int jpScore; //�θ� Ŭ������ ���� �͸� �߰��ؼ� ��� ����
	
	//�޼ҵ带 �����ޱ�� ������ ����� ������ ���� �׷��� info() �޼ҵ� ������.
	//�ڱ�Ұ� ���
	@Override
	public void info() {
		super.info();
		System.out.println(jpScore);
	}
	
	//super�� ����Ŭ������ ����
//��� ����, �ڽ� Ŭ������ �θ� Ŭ������ �ִ°͵��� ���� �����޾Ƽ� ��� ����.
}
