package Static;

public class Klubas {

	private String first;
	private String last;
	private static int members = 0;
	
	public Klubas(String fn, String ls){
		first = fn;
		last = ls;
		members++;
		
		System.out.printf("ECHO>> Narys: %s\t%s. Numeris: %d\n", first, last, members);
	}
	
	public String getFirst(){
		return first;
	}
	public static int getMembers(){
		return members;
	}
	
}
