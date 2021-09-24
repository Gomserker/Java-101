
public class Computer extends Product{
	private String cpu;
	private int ram;
	private int hdd;
	
	public Computer() {}
	public Computer(String cpu, int ram, int hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	
	@Override
	public void info() {
		super.info();
		System.out.println(cpu);
		System.out.println(ram + "GB");
		System.out.println(hdd + "GB");
	}
}
