
class Bg extends Student{
	
	public Bg() {}
	
	public Bg(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	void Ssignal() {
		System.out.println("�Խ� �Ϸ�");
	}
	
	void Fsignal() {
		System.out.println("��� �Ϸ�");
	}

}
