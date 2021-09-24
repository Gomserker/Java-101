
public class Laptop extends Product{
	private double weight;
	private int batteryCapacity;
	
	public Laptop(double weight, int batteryCapacity) {
		this.weight = weight;
		this.batteryCapacity = batteryCapacity;
	}
	@Override
	public void info() {
		super.info();
		System.out.println(weight + "Kg");
		System.out.println(batteryCapacity + " mAhm");
	}
}
