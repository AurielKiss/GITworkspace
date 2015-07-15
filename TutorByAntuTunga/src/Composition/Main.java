package Composition;

public class Main {

	public static void main(String[] args) {
		Pagalba jou = new Pagalba(85,10,29);
		Vagis ims = new Vagis("Aure", jou);
		
		System.out.println(jou);
	}

}
