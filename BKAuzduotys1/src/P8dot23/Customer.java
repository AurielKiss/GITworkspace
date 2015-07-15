package P8dot23;

public class Customer {
double total = 0.0;
double tot = 0.0;
	
	void makePurchase(double amount){
		
		total += amount;
		tot += amount;
		
		if (discountReached()) {
			total = total -10;
			tot = 0;
			System.out.println("premija 10");
		}
		System.out.println("Islaidos : "+total);
		System.out.println("Counter : "+tot);
	}
	
	boolean discountReached(){
		if (tot >= 100) 
			return true;
		 else return false;
			
	}
	
	
}
