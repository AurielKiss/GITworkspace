package Darbuotojas;

import java.util.Arrays;

public class Testas {

	public static void main(String[] args) {
		Darbuotojas d1 = new Darbuotojas("Jonas", 5_000, 2014, 1, 20);
		Darbuotojas d2 = new Darbuotojas("Petras", 2_000, 2014, 5, 20);
		Darbuotojas d3 = new Darbuotojas("Ona", 10_000, 2014, 8, 20);
		Bosas b1 = new Bosas("Algis", 15_000, 2013, 1, 5);
		b1.setPremija(5_000);
		Bosas b2 = new Bosas("Matas", 12_000, 2013, 12, 1);
		
		Darbuotojas[] abc = {d1, d2, d3, b1, b2};
		
		Darbuotojas[] bcd = {
				new Darbuotojas("Jonas", 5_000, 2014, 1, 20),
				new Darbuotojas("Petras", 2_000, 2014, 5, 20),
				new Darbuotojas("Ona", 10_000, 2014, 8, 20)
		};
		
		Arrays.sort(bcd, new RikiavimasPagalVarda());
		
		//for (Darbuotojas d : abc)
//			System.out.println(d);
//		System.out.println();
		for (Darbuotojas d : bcd)
			System.out.println(d);
		System.out.println("-----");
//		System.out.println(bcd[1]);
		Arrays.sort(bcd);
		for (Darbuotojas d : bcd)
			System.out.println(d);
		
		Arrays.sort(bcd, new RikiavimasPagalDataAtbulai());
		for (Darbuotojas d : bcd)
			System.out.println(d);
	}

}
