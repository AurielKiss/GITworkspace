package HiLowGame;

import java.util.Random;
import java.util.Scanner;

public class HiLow {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int slaptas = 1 + rand.nextInt(100);
		int skaicius=0, stopas = 0;
		System.out.println("Sp�kite skai�i� 1-100 i� 6 bandym�!");
		

		do
		{
			System.out.println("---------------");
			System.out.print("Jusu skai�ius: ");
			skaicius = scan.nextInt();
			stopas++;
			if (skaicius > slaptas) {
				System.out.println("J�s� skai�ius per didelis");
			} else if (skaicius < slaptas) {
				System.out.println("J�s� skai�ius per ma�as");	
			}
		}
		while((skaicius != slaptas)&&(stopas<6));
		
		
		scan.close();
		
		if ((stopas==7)&&(skaicius != slaptas)){
			System.out.println("****************************");	
			System.out.println("Baig�si �jimai. Pralo��te. Skai�ius: "+slaptas);	
		}
		else {
		System.out.println("**********************");	
		System.out.println("Atsp�jote !!!! Skai�ius: "+slaptas+" �jimai: "+stopas);
		}
		
		}
}
