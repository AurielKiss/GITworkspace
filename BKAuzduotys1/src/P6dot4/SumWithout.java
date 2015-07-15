package P6dot4;

//import java.util.Scanner;

public class SumWithout {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		System.out.println(sumWithoutSmallest(15,10,2,1,5,5,1,5,1,7,1,11,5,16,1,5,16,5));
		

	}
	
	public static int sumWithoutSmallest(int ...numbers){
		int total = 0;
		int maz = 20;
		for(int visi : numbers){
			if (maz > visi) {
				maz = visi;
			}
			
			total+=visi;
			
		}
		return total-maz;
	}

}
