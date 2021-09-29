
public class IronMan {

	private String name;
	private int age;
	
	//���� ���̾���� ��Ͻ�Ÿũ �ϳ����̱� ������ ����� �����ߴ�. �ҽ����� ���ֽñ�.
	private static final IronMan IM = new IronMan("Tony Stark", 32);
	
	private IronMan() {}
	
	private IronMan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//���� �޼ҵ� �ۼ� getInstance�� �ƴϴ��� ���� ����.
	static IronMan getIm() {
		return IM;
	}
	
	public void info() {
		System.out.printf("%s, %d\n", name, age);
		
	}

	
}
