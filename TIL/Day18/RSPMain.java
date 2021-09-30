import java.util.Random;
import java.util.Scanner;

public class RSPMain {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	Random random = new Random();
    	
    	String[] hand = {"", "rock", "scissors", "paper"};
    	
    	int score = 0;
    	
    	
    	while(true) {
    		System.out.println("----");
        	System.out.println("1. rock");
        	System.out.println("2. scissors");
        	System.out.println("3. paper");
        	System.out.println("4. Quit");
        	System.out.println("----");
        	
        	
        	int comChoice = random.nextInt(3) + 1;
        	System.out.println(comChoice);
        	System.out.println("Your choice?");
        	int myChoice = input.nextInt();
        	if (myChoice == 4) {
        		System.out.println("okay, bye");
        		break;
        	} else if (myChoice < 1 || myChoice > 4) {
        		System.out.println("input error");
        		continue;
        	}
        	
         	System.out.println("My choice: " + hand[myChoice]);
        	System.out.println("Computer's choice: " + hand[comChoice]);
        	
        	int result = myChoice - comChoice;
        	
        	// -1, 2 ÆÐ
        	// -2, 1 ½Â
        	
        	if (myChoice == comChoice) {
        		System.out.println("Draw");
        	} else if ((comChoice == 1 && myChoice == 2) || 
        			(comChoice == 2 && myChoice == 3) || 
        			(comChoice == 3 && myChoice == 1)) {
        		System.out.println("Lose");
        	} else {
        		System.out.println("Win");
        	}
        	
//        	if (myChoice == 1) {
//        		if (comChoice == 1) {
//        			System.out.println("Draw");
//        		} else if (comChoice == 2) {
//        			System.out.println("Player Win");
//        			score++;
//        		} else {
//        			System.out.println("Player Lost");
//        			break;
//        		}
//        	}
//        	
//        	if (myChoice == 2) {
//        		if (comChoice == 1) {
//        			System.out.println("Player Lost");
//        			break;
//        		} else if (comChoice == 2) {
//        			System.out.println("Draw");
//        		} else {
//        			System.out.println("Player Win");
//        			score++;
//        		}
//        	}
//        	
//        	if (myChoice == 3) {
//        		if (comChoice == 1) {
//        			System.out.println("Player Win");
//        			score++;
//        		} else if (comChoice == 2) {
//        			System.out.println("Player Lost");
//        			break;
//        		} else {
//        			System.out.println("Draw");
//        		}
//        	}
        	
//        	if (myChoice == 4) {
//        		System.out.println("Okay, bye");
//        		break;
//        	}
       
    	}
    	
    	System.out.println("Game Over");
    	System.out.println("Score : " + score);
    }
}
