
public class Professor extends Human{
	String subject;
	
	@Override
	public void info() {
		super.info();
		System.out.println(subject);
	}
}
