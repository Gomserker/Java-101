package wiki;

import java.util.Scanner;

public class DiceGameTest {
	public static void main(String[] args) {
		
		DiceGame d1 = new DiceGame();
		Scanner input = new Scanner(System.in);
		
		int num;
		String anykey;
		
//		System.out.println(d1.getPlayerDice());
//		System.out.println(d1.getComputerDice());
		System.out.println("----------------------");
		System.out.println("ゲームを始めますか?");
		System.out.println("1. Yes // 2. No");
		System.out.println("----------------------");
		num = input.nextInt();
		
		while (true) {
			
			System.out.println("Input any key to continue");
			anykey = input.next();
			if (num==2) {
				System.out.println("ゲームを終了します。");
				break;
			} else if (num==1) {
				d1.loading();
				System.out.println("-------------------------------------");
				int playernum = d1.getPlayerDice();
				System.out.println("プレイヤーのダイス: " + playernum);
				int pcnum = d1.getComputerDice();
				System.out.println("PCのダイス: " + pcnum);
				System.out.println("-------------------------------------");
				
				if (playernum > pcnum) {
					d1.winGame();
					
				} else if (playernum == pcnum) {
					d1.drawGame();
					
				} else {
					d1.loseGame();
					break;
					
				}
			} else {
				System.out.println("インプットエラーです。");
			}
		}	
	}
}
