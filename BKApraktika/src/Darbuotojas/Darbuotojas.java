package Darbuotojas;

import java.time.LocalDate;

public class Darbuotojas implements Comparable<Darbuotojas>{
	private String vardas;
	private double alga;
	private LocalDate idarbinimoData;
	
	public Darbuotojas(String vardas, double alga, int metai, int menuo, int diena ){
		this.vardas = vardas;
		this.alga = (alga >= 0) ? alga : 0;
		idarbinimoData = LocalDate.of(metai, menuo, diena);
	}

	public String getVardas() {
		return vardas;
	}

	public double getAlga() {
		return alga;
	}

	public LocalDate getIdarbinimoData() {
		return idarbinimoData;
	}
	
	public void didintiAlga(double procentai){
		double pakelimas = alga * procentai / 100;
		alga += pakelimas;
	}

	@Override
	public String toString() {
		return "vardas= " + vardas + ", alga= " + getAlga()
				+ ", idarbinimoData= " + idarbinimoData;
	}

	@Override
	public int compareTo(Darbuotojas o) {
		return Double.compare(alga, o.alga);
	}
}
