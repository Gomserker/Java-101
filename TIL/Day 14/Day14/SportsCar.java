package Day14;

public class SportsCar extends Vehicle{
	int cost;
	
	@Override
	public void info() {
		super.info();
		System.out.println("АЁАн: " + cost);
	}
}
