package P6dot10;

public class Main {
	
	 

	public static void main(String[] args) {
		int pirmas[] = {5,3,2,5,6,4,2,4};
		int antras[] = {6,2,5,4,2,9,5,3};
		System.out.println(sameSet(pirmas, antras));
	}
	
	public static boolean sameSet(int[] a, int[] b){
		boolean nzn = false;
		
		for(int i = 0; i < a.length; i++){
			nzn = false;
			for (int j = 0; j < b.length; j++){
			
			if (a[i] == b[j])
				nzn = true;
			}
			
			if (nzn == false) break;
		}
		
		
		if (nzn == true) 
			return true;
		else return false;
	}

}
