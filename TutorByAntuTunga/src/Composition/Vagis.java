package Composition;

public class Vagis {
	private String name;
	private Pagalba birthday;
	
	public Vagis(String theName, Pagalba theDate){
		name = theName;
		birthday = theDate;
		
		//System.out.printf("Kontruktorius2 sako : %s\n", this);
	}
	

	public String toString(){
		return String.format("My name is %s, my birthday is %s",  name, birthday);
	}

}
