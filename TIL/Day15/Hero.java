
public abstract class Hero {
	String name;
	
	public Hero() {}
	
	public Hero(String name) {
		super();
		this.name = name;
	}
	
	abstract void attack();
}

class SuperMan extends Hero{
	
	public SuperMan() {}
	
	public SuperMan(String name) {
		super(name);
	}
	
	@Override
	void attack() {
		System.out.println("Attack with Eyeball laserbeam");
	}
}

class IronMan extends Hero{
	
	public IronMan() {}
	
	public IronMan(String name) {
		super(name);
	}
	
	@Override
	void attack() {
		System.out.println("Attack with Hand laserbeam");
	}
}

class Hulk extends Hero{
	
	public Hulk() {}
	
	public Hulk(String name) {
		super(name);
	}
	
	@Override
	void attack() {
		System.out.println("Beat the shit out of them");
	}
}