package P6dot28;

import java.util.ArrayList;
import java.util.Random;

public class ListasV {

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
		System.out.println(mergeSorted(al1, al2));
	}
	
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList all = new ArrayList();
		int i = 0, narys1, narys2;
		
		while((a.size()>i) && (b.size()>i)){
			
		narys1 = a.get(i);
		narys2 = b.get(i);
		
		if ( narys1 < narys2 ){
			
			all.add(narys1);
			all.add(narys2);
			
		} else if ( narys1 >= narys2 ){
			
			all.add(narys2);
			all.add(narys1);
			
		}	
		
		i++;
		
		}
		if (a.size() > b.size()){
			all.add(a.get(i));}
		else if (a.size() < b.size()){
			all.add(b.get(i));}
		
		return all;
	}

}
