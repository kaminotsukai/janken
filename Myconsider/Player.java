package Myconsider;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Player {
	public static int playerWinCount = 0;
	public static String playername;
	public static int pcWinCount = 0;
	
	public Player() {
		// TODO Auto-generated constructor stub
		createName();
	}
	
	public static void createName() {
		System.out.println("自分のPlayerに名前をつけてあげましょう");
		Scanner name = new Scanner(System.in);
	    playername = name.nextLine();
	    
	    System.out.println(playername+"さんとして戦います");
	}
	
	public static void jankenbuttle() throws IOException {
		System.out.println("【じゃんけん開始】");

//		じゃんけん開始
		for(int i = 1;i <= 5; i++) {
		System.out.println("");	
		System.out.println("【"+i+"回戦目】");
		
		System.out.println("===============");
		System.out.println("stone    ：   0");
		System.out.println("scissors ：   1");
		System.out.println("paper    ：   2");
		System.out.println("===============");
		
//		PCのじゃんけんの手
		Random r = new Random();
		int pcNum = r.nextInt(3);
		
		System.out.println("ここに入力してください");
		
//		playerのじゃんけんの手
		Scanner s = new Scanner(System.in);
		int playerNum = s.nextInt();
		
//		playerが勝利する場合
		if(pcNum == 0 && playerNum == 2 || 
		   pcNum == 1 && playerNum == 0 || 
		   pcNum == 2 && playerNum == 1 ) {
			playerWinCount++;
			if(pcNum == 0) {
				System.out.println("");
				System.out.println("パー("+playername+"さん)  vs グー");
			}else if(pcNum == 1) {
				System.out.println("");
				System.out.println("グー("+playername+"さん)  vs チョキ");
			}else {
				System.out.println("");
				System.out.println("チョキ("+playername+"さん)  vs パー");
			}
			System.out.println(playername+"さんが勝ちました");
				
			
//			playerが負ける場合
		}else if(pcNum == 0 && playerNum == 1||
				 pcNum == 1 && playerNum == 2||
				 pcNum == 2 && playerNum == 0) {
			if(pcNum == 0) {
				System.out.println("----------------");
				System.out.println("チョキ（"+playername+"さん） vs グー");
				System.out.println("----------------");
			}else if(pcNum == 1) {
				System.out.println("----------------");
				System.out.println("パー("+playername+"さん) vs チョキ");
				System.out.println("----------------");
			}else {
				System.out.println("----------------");
				System.out.println("グー("+playername+"さん)  vs パー");
				System.out.println("----------------");
			}
			pcWinCount++;
			System.out.println(playername+"さんは負けました");
		}else {
			if(pcNum == 0) {
				System.out.println("----------------");
				System.out.println("グー("+playername+"さん)  vs グー");
				System.out.println("----------------");
			}else if(pcNum == 1) {
				System.out.println("----------------");
				System.out.println("チョキ("+playername+"さん)  vs チョキ");
				System.out.println("----------------");
			}else {
				System.out.println("----------------");
				System.out.println("パー("+playername+"さん)  vs パー");
				System.out.println("----------------");
			}
			System.out.println("引き分けです");
			
		}
		
		
		}
	}
	
}
