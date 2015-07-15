package P8dot23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer as = new Customer();
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
		as.makePurchase(scan.nextInt());
		}
		
	}

	
}
