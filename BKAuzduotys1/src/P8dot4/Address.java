package P8dot4;

public class Address {
	
	 int number;
	private String street;
	private String city;
	private String state;
	private int postal;
	
	Address(int num, String str, String cit, String sta, int post){
		
		number = num;
		street = str;
		city = cit;
		state = sta;
		postal = post;
		print();
	}
	
	Address(String str, String cit, String sta, int post){
		
		street = str;
		city = cit;
		state = sta;
		postal = post;
		print();
	}
	
	public void print(){
		System.out.println(this.number+" "+this.street+" "+this.city+" "+this.state+" "+this.postal);
		
	}
	
	public boolean comesBefore(Object a) {
		if (this.postal < 50){
			System.out.println(this.postal);
			return true;
		}
		
		 else {
			 System.out.println(this.postal);
			 return false;
		 }
	}

}
