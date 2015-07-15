
public class MultiArray {

	public static void main(String[] args) {
		int mas1[][] = {{4,5,6},{7,8,9}};
		int mas2[][] = {{1,2},{7,8,9,10,11},{3,4,5}};
		
		System.out.println("Pirms");
		israsas(mas1);
		System.out.println();
		System.out.println("Ontras");
		israsas(mas2);

	}

	
	public static void israsas(int masyvas[][]){
		for(int irow = 0; irow<masyvas.length; irow++){
			for(int icolumn = 0; icolumn<masyvas[irow].length; icolumn++){
			System.out.print(masyvas[irow][icolumn]+"  ");	
			}
			System.out.println();
		}
		
	}
	
}
