
public class OAMain {
	public static void main(String[] args) {
		
		//���� -> ������ �߻����� ����
		
		// ���� ��� void attack();�� ����.
		// �����̶�� �� ������ �����ؾ� �Ѵ�.
		
		//���۸�
		SuperMan superman = new SuperMan("���۸�");
		superman.attack();
		
		//���̾��
		IronMan ironman = new IronMan("���̾��");
		ironman.attack();
		//��ũ
		
		Hulk hulk = new Hulk("��ũ");
		hulk.attack();
		
	}
}
