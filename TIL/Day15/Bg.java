
class Bg extends Student{
	
	public Bg() {}
	
	public Bg(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	void Ssignal() {
		System.out.println("입실 완료");
	}
	
	void Fsignal() {
		System.out.println("퇴실 완료");
	}

}
