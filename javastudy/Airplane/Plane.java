package wiki;

public class Plane {
// �ʵ� ����
	private String maker;
	private String model;
	private int maximumPassenger;
	private static int planes;
// ������ �����ε�
	public Plane() {
		planes++;
	}
	
	public Plane(String maker) {
		this.maker = maker;
		planes++;
	}
	
	public Plane(String maker, String model) {
		this.maker = maker;
		this.model = model;
		planes++;
	}
	
	public Plane(String maker, String model, int maximumPassenger) {
		this.maker = maker;
		this.model = model;
		this.maximumPassenger = maximumPassenger;
		planes++;
	}

//	Getter, Setter
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaximumPassenger() {
		return maximumPassenger;
	}
	public void setMaximumPassenger(int maximumPassenger) {
		this.maximumPassenger = maximumPassenger;
	}
	
	public static int getPlanes() {
		return planes;
	}

	public void info() {
		System.out.printf("������: %s, �𵨸�: %s, �ִ� ž���ο�: %d, ����� ����� ���: %d\n", getMaker(), getModel(), getMaximumPassenger(), getPlanes());
	}
	
}
