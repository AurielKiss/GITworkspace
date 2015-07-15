package Kauliukas;

import java.util.Random;


public class Kaulas {

	public static void main(String[] args) {
		Random rand = new Random();
		int masyvas[] = new int[7];
		int viso = 0;
		
		for(int count=1; count<=1000; count++){
			++masyvas[1+rand.nextInt(6)];
		}
		
		System.out.println("Skaicius Kiekis");
		
		for (int i=1; i<7; i++){
			System.out.println(i+"\t "+masyvas[i]);
			viso+=masyvas[i];
		}
		System.out.println();
		System.out.println("Viso "+viso);
		
	}

}
