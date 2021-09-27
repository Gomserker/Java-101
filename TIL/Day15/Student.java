
public abstract class Student {
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	abstract void Ssignal();
	
	abstract void Fsignal();
	
	public void info() {
		System.out.println("name is " + name);
		System.out.println("age is " + age);
	}
	
}
