package Skaiciai;
import static java.lang.System.out;

import java.math.BigDecimal;

public class SkaiciaiTestas {

	public static void main(String[] args) {
		double d = -123;
		double e = 0;
		if ( Double.isInfinite(d/e))
			System.out.println("Dalindami is nulio gauname begalybe.");
		System.out.println("Begalybe: " + d/e);
		double rez = Math.sqrt(-1);
		System.out.println(rez);
		
		System.out.println(rez == Double.NaN);
		System.out.println(Double.isNaN(rez));
		System.out.println(Double.NaN == Double.NaN);
		
		float af = 12345678.0f;
		System.out.println("af = " + af);
		float bf = 12345679.0F;
		System.out.println("bf = " + bf);
		float cf = 1.01233995F;
		System.out.println("cf = " + cf);
		float sf = (af + bf + cf) / 2.0f;
		System.out.println("sf = " + sf);
		System.out.println("viengubas po saknim: " + (sf * (sf - af) * (sf - bf) * (sf - cf)));
		float plotasF = (float)Math.sqrt(sf * (sf - af) * (sf - bf) * (sf - cf));
		System.out.println("Viengubas tikslumas: " + plotasF);
		
		double ad = 12345678.0;
		double bd = 12345679.0;
		double cd = 1.01233995;
		double sd = (ad + bd + cd) / 2.0;
		System.out.println("sd = " + sd);
		double plotasD = Math.sqrt(sd * (sd - ad) * (sd - bd) * (sd - cd));
		System.out.println("Dvigubas tikslumas: " + plotasD);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println("Tikroji 0,3 reiksme " + 0.3);
		System.out.println("Tikroji 0,3 x 3 reiksme " + 0.3 * 3);
		BigDecimal bigD = BigDecimal.valueOf(3);
		System.out.println("Naudojant BigDecimal " + bigD.multiply(BigDecimal.valueOf(0.3)));
	} 

}
