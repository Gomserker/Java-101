import java.util.Scanner;

public class Printf {
	public static void main(String[] args) {
  
  Scanner keyboard = new Scanner(System.in);
  
  int num = 3;
		
		System.out.printf("Model: ");
		String model = keyboard.next();
		
		System.out.printf("Cost: ");
		int cost = keyboard.nextInt();
		
		System.out.printf("Weight: ");
		double weight = keyboard.nextDouble();
		
		System.out.printf("Maker: ");
		String maker = keyboard.next();
		
		System.out.printf("%03d)--------------\n", num);
		System.out.printf("Model	: %s\n", model);
		System.out.printf("Cost	: %d $\n", cost);
		System.out.printf("Weight	: %.1f g\n\n", weight);
		System.out.printf("Designed By \"%s\"", maker);
		
		
	}
}
