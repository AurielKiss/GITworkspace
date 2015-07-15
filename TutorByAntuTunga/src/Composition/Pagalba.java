package Composition;

/**
 * @author AurielKiss
 *
 */
public class Pagalba {
	private int month;
	private int day;
	private int year;
	
	public Pagalba (int y, int m, int d){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("Kontruktorius sako : %s\n", this);
		System.out.println("Kontruktorius sako :"+ month);
	}
	
	public String toString(){
		return String.format("%d  %d  %d", year, month, day);
	}

}
