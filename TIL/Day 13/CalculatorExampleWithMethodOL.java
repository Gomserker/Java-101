package wiki;

public class CalculatorExampleWithMethodOL {
	public static void main(String[] args) {
		
		CalculatorWithMethodOL cal1 = new CalculatorWithMethodOL();
		
		double result1 = cal1.areaSquare(10);
		double result2 = cal1.areaSquare(5, 8);
		
		System.out.printf("area of square : %.1f\n",result1);
		System.out.printf("area of rectangle : %.1f\n",result2);
	}
}
