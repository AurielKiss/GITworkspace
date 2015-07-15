package P6dot24;

//nebaigtas

import java.util.Random;
import java.util.Scanner;

public class Theatre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int koks;
		
		int vietos[][] = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
		{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
		{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
		{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
		{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
		{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
		{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};
		
		
		for (int i=0; i < 30; i++){
			
			int eil = rand.nextInt(7);
			int stul = rand.nextInt(10); 			
			vietos[eil][stul] = 0; 
		}
			
		System.out.println("	     MAIN HALL :");
		for(int j = 0; j < 7; j++) {
			
			System.out.println();
			System.out.println();
			
		for (int arabas:vietos[j]){
			
			
			if (arabas == 0){
				System.out.print("00  ");
			}
			else
				System.out.print(arabas+"  ");
		}
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		do {
		System.out.println("Hello, choose 1. by SEAT or 2. by PRICE");
		koks = scan.nextInt();	
		} while( (koks != 1) && (koks != 2) );
		
		if (koks == 1){	
			
		}			
		else if (koks == 2){
			System.out.println("Choose price");
			koks = scan.nextInt();
			
			for(int j = 0; j < 7; j++) {
				
				System.out.println();
				System.out.println();
				
			for (int arabas:vietos[j]){
				
				
				if (arabas == koks){
					System.out.print(arabas+"  ");
				}
				else
					System.out.print("xx  ");
					
				}
			}}
		scan.close();
	}

}
