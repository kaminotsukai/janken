package Myconsider;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.ietf.jgss.Oid;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Main implements jankeninterface{

	
	public static void main(String[] args) throws IOException {
		
		//プレイヤーの設定
		Player p = new Player();
	    
		//じゃんけんの処理
		Player.jankenbuttle();
	
		//結果表示
		result();


	}
	
	

	public static void result() {
		System.out.println("");
		System.out.println("【じゃんけん終了】");
		System.out.println("==================================");
		if(Player.pcWinCount > Player.playerWinCount) {
			System.out.println("結果：【PCが勝利しました】");
		}else if(Player.pcWinCount < Player.playerWinCount) {
			System.out.println("結果：【"+Player.playername+"さんが勝利しました】");
		}else {
			System.out.println("結果：【引き分けです】");
		}
		System.out.println("==================================");
	}
}
