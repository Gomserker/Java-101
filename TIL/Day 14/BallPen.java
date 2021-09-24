
public class BallPen extends Product{
	private String color;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void info() {
		super.info();
		System.out.println("Color: " + getColor());
	}
}
