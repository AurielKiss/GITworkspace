package Datos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class Datos {

	public static void main(String[] args) {
		Date pasaulioPabaiga = new Date(Long.MAX_VALUE);
		System.out.println("Pasaulio pabaiga: " + pasaulioPabaiga);
		
		LocalDate dDabar = LocalDate.now();
		System.out.println(dDabar);
		LocalTime lDabar = LocalTime.now();
		System.out.println(lDabar);
		LocalDateTime dlDabar = LocalDateTime.now();
		System.out.println(dlDabar);
		
		System.out.println(System.currentTimeMillis());
		
		Instant epochosSekundes = Instant.ofEpochSecond(Integer.MAX_VALUE);
		ZoneId musuZona = ZoneId.systemDefault();
		ZonedDateTime kazkada = ZonedDateTime.ofInstant(epochosSekundes, musuZona);
		System.out.println(kazkada);
		
		LocalDate amziausPabaiga = LocalDate.of(2000, 12, 31);
		Period skirtumas = Period.between(amziausPabaiga, dDabar);
		System.out.println("Skirtumas tarp sios dienos ir praeito amziaus " + skirtumas);
		
		System.out.println("Po penkiu metu ir penkiu dienu bus " + dDabar.plusYears(5).plusDays(5));
	}

}
