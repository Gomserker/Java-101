package Day14;

public class Porsche {
	public static void main(String[] args) {
		
		Vehicle normalCar = new Vehicle();
		SportsCar carrera = new SportsCar();
		
		normalCar.maxSpeed = 120;
		normalCar.name = "±×³É Â÷";
		
		normalCar.info();
		
		carrera.maxSpeed = 300;
		carrera.name = "Carrera";
		carrera.cost = 12000;
		
		carrera.info();
	}
}
