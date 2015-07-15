package P6dot27;

import java.util.ArrayList;
import java.util.Random;

public class KrcListas {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		for (int i = 0; i < 5; i++){
			al1.add(1+rand.nextInt(10));
			al2.add(1+rand.nextInt(10));
		}
		System.out.println("Initial size of al1: " + al1.size());
		System.out.println("Initial size of al1: " + al1);
		System.out.println("----------------------------------------------------");
		
		al2.add("9");
		System.out.println("Initial size of al2: " + al2.size());
		System.out.println("Initial size of al2: " + al2);
		System.out.println("-----------------------------------------------------");

		System.out.println("Sujungus gauname :");
		System.out.println(merge(al1, al2));
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList all = new ArrayList();
		int i = 0;
		
		while((a.size()>i) && (b.size()>i)){
			
		int narys = a.get(i);
		all.add(narys);
		narys = b.get(i);
		all.add(narys);
		i++;
		
		}
		if (a.size() > b.size()){
			all.add(a.get(i));}
		else if (a.size() < b.size()){
			all.add(b.get(i));}
		
		return all;
	}

}
