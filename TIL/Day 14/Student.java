//부분집합 관계에 있으면 is a 관계, 상속관계 성립
public class Student extends Human{
	//이름, 나이, 일어점수
	int jpScore; //부모 클래스에 없는 것만 추가해서 사용 가능
	
	//메소드를 물려받기는 했지만 기능이 부족한 상태 그래서 info() 메소드 재정의.
	//자기소개 기능
	@Override
	public void info() {
		super.info();
		System.out.println(jpScore);
	}
	
	//super는 상위클래스를 뜻함
//상속 관계, 자식 클래스는 부모 클래스에 있는것들을 전부 물려받아서 사용 가능.
}
