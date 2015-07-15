package Darbuotojas;

public class Bosas extends Darbuotojas {
	private double premija;
	
	public Bosas(String vardas, double alga, int metai, int menuo, int diena) {
		super(vardas, alga, metai, menuo, diena);
		premija = 0;
	}

	public double getPremija() {
		return premija;
	}

	public void setPremija(double premija) {
		this.premija = premija >= 0 ? premija : 0;
	}
	
	@Override
	public double getAlga() {
		double bazineAlga = super.getAlga();
		return bazineAlga + premija;
	}

	@Override
	public String toString() {
		return  super.toString() + ", visa alga= " + getAlga() +
				", premija= " + premija;
	} 

}