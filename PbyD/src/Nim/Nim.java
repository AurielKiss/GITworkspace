package Nim;


import java.util.Random;
import java.util.Scanner;

public class Nim {

	public static void main(String[] args) throws InterruptedException {

	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	int sk1 = 5 + rand.nextInt(4);
	int sk2 = 5 + rand.nextInt(4);
	int sk3 = 5 + rand.nextInt(4);
	
	String player1 = "null", player2 = "null";
	String eil = null;;
	int kiek = 0;
	boolean gamer = true, auto = false, who = false;
	String seka[] = {"A","B","C"};
	
	System.out.println("--------------------- the game --------------------");
	System.out.println("----------------------- NIM -----------------------");
	System.out.println("");
	System.out.print("How many players? Enter \"1\" or \"2\": ");
	
	int players = scan.nextInt();
	System.out.println("");
	System.out.print("Enter 1 player name: ");
	player1 = scan.next();
	
	System.out.println("");
	
	if (players == 2){
	System.out.print("Enter 2 player name: ");
	player2 = scan.next();
	
	} else if (players == 1){
		
		player2 = "CPU";
		auto = true;
		
	}
	System.out.println("--------------------- the game --------------------");
	System.out.println("----------------------- NIM -----------------------");
	
	
	while ((sk1 >= 0) || (sk2 >= 0) || (sk3 >= 0)){

		if (gamer){
			System.out.println(">>>>> "+player1+" turn <<<<<");
			gamer = false;
		} else {System.out.println(">>>>> "+player2+" turn <<<<<");
			gamer = true;
		}
		
		System.out.println("");
		System.out.print("A: ");
		Thread.sleep(100);
		for (int aa = 0 ; aa <= sk1; aa++){
			System.out.print("(o) ");
			Thread.sleep(100);
		}
		System.out.println("");
		System.out.print("B: ");
		Thread.sleep(100);
		for (int bb = 0 ; bb <= sk2; bb++){
			System.out.print("(o) ");
			Thread.sleep(100);
		}
		System.out.println("");
		System.out.print("C: ");
		Thread.sleep(100);
		for (int cc = 0 ; cc <= sk3; cc++){
			System.out.print("(o) ");
			Thread.sleep(100);
		}
		System.out.println("");
		System.out.println("");
		
		
		if (!who){	
		do { System.out.print("Choose line: ");
		eil = scan.next();
		} while((!eil.equals("A"))&&(!eil.equals("B"))&&(!eil.equals("C")));
	
		do{System.out.print("Choose how much to remove "+eil+" : ");
		kiek = scan.nextInt();
		
		} while((kiek <= 0) || (kiek>10));
		}
		
		 if ((auto) && (who)) {
			eil = seka[rand.nextInt(3)];
			kiek = 1 + rand.nextInt(5);
			Thread.sleep(1000);
			System.out.print("CPU choose line: ");
			Thread.sleep(1000);
			System.out.println(eil);
			Thread.sleep(1000);
			System.out.print("CPU removes: ");
			Thread.sleep(1000);
			System.out.println(kiek);
			gamer = true;	
		}
					
		System.out.println("---------------------------------------------------");
		
		if (eil.equals("A")){
			sk1 = sk1 - kiek;
		} else if (eil.equals("B")) {
			sk2 = sk2 - kiek;
		} else if (eil.equals("C")) {
			sk3 = sk3 - kiek;
		} else System.out.println("Nëra tokios eilutës!");
		if ((who == false) && (auto == true)){
			who = true;} else who = false;
	}
	
	System.out.println("--------------------- the game --------------------");
	System.out.println("----------------------- NIM -----------------------");
	System.out.println("");
	
	if (gamer){
		System.out.println("GREETINGS! WINNER "+player2);
	} else {
		System.out.println("GREETINGS! WINNER "+player1);
	}
	System.out.println("");
	System.out.println("--------------------- GOOD DAY --------------------");
	
	scan.close();
	}

}
