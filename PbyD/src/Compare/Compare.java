package Compare;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
String vat = "kazkas";
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int a = "axe".compareTo("dog");
		System.out.println(a);
		
		int b = "a".compareTo("d");
		System.out.println(b);
		
		int c = vat.compareTo("dog");
		System.out.println(c);
		int d = vat.compareTo(vat);
		System.out.println(d);
		int e = "kazkas".compareTo(vat);
		System.out.println(e);
		
		int f = "awwwwwwwwwwwwwwwwwww".compareTo("w l l");
		System.out.println(f);
		
		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applewwww".compareTo("apple") );
		
		System.out.println("---------------------------------------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("Áveskite savo vardà ir suzinokite ar ilgai laukti eilëje:");
		String vardas = in.nextLine();
		in.close();
		
		if ((vardas.compareTo("carswell"))<0){
			System.out.println("you don't have to wait long");
			System.out.println(vardas.compareTo("carswell")); 
		}
		else if ((vardas.compareTo("jones"))<0){
			System.out.println("that's not bad");
			System.out.println(vardas.compareTo("jones")); 
		}
		else if ((vardas.compareTo("smith"))<0){
			System.out.println("looks like a bit of a wait");
			System.out.println(vardas.compareTo("smith")); 
		}
		else if ((vardas.compareTo("young"))<0){
			System.out.println("it's gonna be a while");
		}
		else
		System.out.println("not going anywhere for a while?"); 	
	}
}
