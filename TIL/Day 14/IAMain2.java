
public class IAMain2 {
	public static void main(String[] args) {
		// - �ʵ� '����' x -> �ʵ忡 �����̺� �Žÿ�
		// - ���߿� �� o -> ���ͷ� �޾Ƶ� �ǿ�, ������ o -> �����ε����� �����Ͽ�
		
		
		//��ǻ�� : �̸�(��ǰ��), ����, 
		//cpu, ram, hdd
		//�������
		
		//���� : �̸�(��ǰ��), ����, 
		//�÷�
		//�������
		
		//��Ʈ�� : �̸�, ����, 
		//����, ���͸� �뷮
		//�������
		
		Computer computer = new Computer("i5-11970", 16, 256);
		computer.setName("iMac");
		computer.setCost(1200);
		computer.info();
		
		
//		���� Ŭ���� �ʵ尡 ���� private�� �ɷ� �ִµ� ����� �ȵǾ�� �ϴµ� ��� ���� ������ �ɱ�?
		
		System.out.println("-------------------");
		
		BallPen ballpen = new BallPen();
		ballpen.setColor("red");
		ballpen.setName("Jetstream");
		ballpen.setCost(12);
		ballpen.info();
		
		System.out.println("--------------------");
		
		Laptop laptop = new Laptop(1.7, 11200);
		laptop.setName("MacBook 17inch");
		laptop.setCost(1199);
		laptop.info();
	}
}
