
public class IronMan {

	private String name;
	private int age;
	
	//내게 아이언맨은 토니스타크 하나뿐이기 때문에 상수로 설정했다. 팬심으로 봐주시길.
	private static final IronMan IM = new IronMan("Tony Stark", 32);
	
	private IronMan() {}
	
	private IronMan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//정적 메소드 작성 getInstance가 아니더라도 뭐든 좋다.
	static IronMan getIm() {
		return IM;
	}
	
	public void info() {
		System.out.printf("%s, %d\n", name, age);
		
	}

	
}
