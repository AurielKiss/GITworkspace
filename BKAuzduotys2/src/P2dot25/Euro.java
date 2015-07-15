package P2dot25;

import java.util.Scanner;

public class Euro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iveskite suma, kuria norite iskeisti :");
		
		int suma = scan.nextInt();
		
		keitykla(suma);
		scan.close();

	}
	
	static void keitykla(int sum){
		
		int visi[] = {500, 200, 100, 50, 20, 10 , 5, 2, 1};
		int kiek[] = new int[9];

		int gg = sum;
				for(int i = 0; i < 9; i++){
					
					while((gg/visi[i])>=1){
						gg = gg-visi[i];
						++kiek[i];
						if (gg == 1) break;
					}
				}
				
					System.out.println("---------------------------------");
						System.out.println("500 200 100 50  20  10  5   2   1");
						for(int suma : kiek){
						System.out.print(suma+"   ");
						}
						System.out.println("");
					System.out.println("---------------------------------");			
				
	}
	
}
