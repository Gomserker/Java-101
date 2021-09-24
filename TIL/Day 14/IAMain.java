
public class IAMain {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		
		//사람 = 이름, 나이, 자기소개(정보출력)
		//병관, 30, 자기소개
		
		h1.name="병관";
		h1.age=30;
		
		h1.info();
		System.out.println("-----------------");
		//학생 = 이름, 나이, 일본어 점수
		//자기소개 기능
		
		Student student = new Student();
		student.name = "건우";
		student.age = 20;
		student.jpScore = 99;
		student.info();
		
		//선생님 = 이름, 나이, 담당과목
		//mz, 27, java
		//자기소개 다 가능
		System.out.println("-----------------");
		Professor professor = new Professor();
		professor.name = "mz";
		professor.age = 27;
		professor.subject = "java";
		
		professor.info();
	}
}
