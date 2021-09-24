
public class Product {
	private String name;
	private int cost;
	
	public Product() {}
	
	public Product(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	void info() {
		System.out.println(getName());
		System.out.println(getCost() + "$");
	}
}
