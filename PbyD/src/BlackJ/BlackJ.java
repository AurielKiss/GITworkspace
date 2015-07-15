package BlackJ;

import java.util.Random;
import java.util.Scanner;

public class BlackJ {

	public static void main(String[] args) {
		// NEBAIGTAS
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String card11, card22, card33, card44;
		String kas;
		String pav[] = {"B","D","K","T"};
		
		int card1 = 1+rand.nextInt(11);
		if (card1 > 9) {
			card11 = pav[rand.nextInt(4)];}
		
		int card2 = 1+rand.nextInt(11);
		if (card2 > 9) {
			card22 = pav[rand.nextInt(4)];}
		
		int card3 = 1+rand.nextInt(11);
		if (card3 > 9) {
			card33 = pav[rand.nextInt(4)];}
		
		int card4 = 1+rand.nextInt(11);
		if (card4 > 9) {
			card44 = pav[rand.nextInt(4)];}
		
		int carda = card1 + card2;
		int cardb = card3 + card4;
		
		System.out.println("------Black Jack--------");
		System.out.println("");
		System.out.println("Your cards:");
		System.out.println("");
		System.out.println("+------+   +------+");
		System.out.println("|     "+card1+"|   |     "+card2+"|");
		System.out.println("|      |   |      |");
		System.out.println("|      |   |      |");
		System.out.println("+------+   +------+");
		System.out.println("");
		System.out.println("Total: "+(carda));
		System.out.println("-------------------------");
		
		System.out.println("Dealer cards:");
		System.out.println("");
		System.out.println("+------+   +------+");
		System.out.println("|     "+card3+"|   |     "+card4+"|");
		System.out.println("|      |   |      |");
		System.out.println("|      |   |      |");
		System.out.println("+------+   +------+");
		System.out.println("");
		System.out.println("Total: "+(cardb));
		System.out.println("-------------------------");
		
		System.out.println("T-testi, B-baigti");
		kas = scan.next();
		
		if (kas.equals("B")){
			if(carda>cardb){
				System.out.println("Laimojote!");
			}
			
			
			else if (carda<cardb){
				System.out.println("Pralosete!");
			}
		}
		scan.close();

	}

}
