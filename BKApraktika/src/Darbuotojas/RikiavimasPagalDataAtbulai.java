package Darbuotojas;

import java.util.Comparator;
import java.time.LocalDate;

public class RikiavimasPagalDataAtbulai implements Comparator<Darbuotojas> {

	@Override
	public int compare(Darbuotojas o1, Darbuotojas o2) {
		LocalDate data1 = o1.getIdarbinimoData();
		LocalDate data2 = o2.getIdarbinimoData();
		return data2.compareTo(data1);
	}

}
