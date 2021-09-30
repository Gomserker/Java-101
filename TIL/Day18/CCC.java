import java.util.Random;
import java.util.Scanner;

public class CCC {
    public static void main(String[] args) {
    	
        // 참참참
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        String[] table = {"", "Left", "Right", "Up", "Down", "Halt"};
        int score = 0;
        while(true) {
        	score++;
        	System.out.println("------------------------");
            System.out.println("1. Left");
            System.out.println("2. Right");
            System.out.println("3. Up");
            System.out.println("4. Down");
            System.out.println("5. Halt");
            System.out.println("------------------------");
            
            
            int comNumber = random.nextInt(5) + 1;
            System.out.println(comNumber); //Devloper Test
            
            System.out.println("Which direction do you wannna choose? (input number)");
            int playerNumber = input.nextInt();
            
            
            
            if(playerNumber < 0 || playerNumber > 5) {
                System.out.println("input error");
                score--;
                continue;
            }
            	
            	System.out.printf("나 : %s\n", table[playerNumber]);
                System.out.printf("컴 : %s\n", table[comNumber]);
            
            
            
            
            //judgement
            if(playerNumber == comNumber) {
            	System.out.println("Got ya");
            	break;
            } else {
                System.out.println("Dodeged");
                score++;
            }
        }
        System.out.println("Game over");
        System.out.println("score is " + score);
    }
}
