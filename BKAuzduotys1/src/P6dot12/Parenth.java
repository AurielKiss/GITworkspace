package P6dot12;

import java.util.Random;

public class Parenth {

	public static void main(String[] args) {
		
		boolean inRun = false;
		
		Random rand = new Random();
		int mas[] = new int[20];
		
		for(int i = 0; i <20; i++){
		mas[i] = 1 + rand.nextInt(5);
		}
		
		for(int visas:mas){
			System.out.print(visas);
		}

		System.out.println();
		System.out.println("--------------------");		
			
		for(int j = 0; j <20; j++){
				
			if (inRun) {
				
				if (mas[j] != mas[j-1]){
					System.out.print(")");
					inRun = false;
				}
			
			} else if (inRun == false){
				
				if (j != 19){			//cia kad nemestu exceptiono
				if (mas[j] == mas[j+1]){
					System.out.print("(");
					inRun = true;
				}
				}
				
			}
		System.out.print(mas[j]);
		
		}
		
		

	}

}
