package Darbuotojas;

import java.util.Comparator;

public class RikiavimasPagalVarda implements Comparator<Darbuotojas> {

	@Override
	public int compare(Darbuotojas o1, Darbuotojas o2) {
		String vardas1 = o1.getVardas();
		String vardas2 = o2.getVardas();
		return vardas1.compareToIgnoreCase(vardas2);
	}

}
