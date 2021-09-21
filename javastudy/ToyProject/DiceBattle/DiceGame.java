package wiki;


import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	static int winCount;
	private int playerDice;
	private int computerDice;
	
	public DiceGame() {}
	
	public int getPlayerDice() {
		playerDice = random.nextInt(6) + 1;
		return playerDice;
	}

	public int getComputerDice() {
		computerDice = random.nextInt(6) + 1;
		return computerDice;
	}

	public void winGame() {
		winCount++;
		System.out.println("-------------------");
		System.out.println("勝ちました。 おめでとうございます。");
		System.out.println("現在点数: " + winCount);
		System.out.println("-------------------");
		
	}
	
	public void drawGame() {
		System.out.println("-------------------");
		System.out.println("惜しいですね。 もう一回！");
		System.out.println("-------------------");
	}
	public void loseGame() {
		System.out.println("残念ですね。ゲーム終了！");
		System.out.println("最終点数: " + winCount);
		System.out.println("-------------------");
	}
	
	public void askRetry() {
		System.out.println("もう一回やりますか？");
		System.out.println("1. Yes // 2. No");
		int answer = input.nextInt();
	}
	public void loading() {
		System.out.println("----------------");
		System.out.println("ダイスを投げます。");
		for(int i=0; i<3; i++) {
			System.out.println('.');
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
