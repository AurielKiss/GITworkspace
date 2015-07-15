package P8dot4;

public class Main {

	public static void main(String[] args) {
		Address Petras = new Address(152, "Gelvonu", "Vilnius", "Bum", 12345);
		Address Petras2 = new Address("Paneriu", "Vilnius", "Bim", 863);
		Address Petras3 = new Address("Bambuku", "Vilnius", "Vot", 33333);
		Address Petras4 = new Address(152, "Gedvydziu", "Vilnius", "Nzn", 45);

		System.out.println(Petras2.comesBefore(Petras3));
	}



}
