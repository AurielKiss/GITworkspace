package Collatz;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Starting number:");
		int skaicius = scan.nextInt();
		int steps = 0, didz = 0, langas = 0;
		System.out.println("---------------");
		
		do{ 
		//	for(int i=0; i<20; i++){
			if (skaicius%2 == 0){
				System.out.print(skaicius+"  ");
				skaicius=skaicius/2;
				steps+=1;
				langas+=1;
			} else if (skaicius%2 == 1){
				System.out.print(skaicius+"  ");
				skaicius = (skaicius*3)+1;
				steps+=1;
				langas+=1;
			}
			if(langas==20){
				System.out.println("");
				langas=0;
			}
			
			if (skaicius>didz){
				didz=skaicius;
			}
		//	}
		} while (skaicius != 1);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println("Paskutinis skaicius: "+skaicius);
		System.out.println("Zingsniai: "+steps);
		System.out.println("Didziausias: "+didz);
		
		scan.close();
	}

}
