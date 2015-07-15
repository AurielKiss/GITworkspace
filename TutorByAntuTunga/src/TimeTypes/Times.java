package TimeTypes;

public class Times {

	public static void main(String[] args) {
		Otimes Oobject = new Otimes();
		System.out.println(Oobject.toMilitary());
		System.out.println(Oobject.toString());
		
		Oobject.setTime(15, 10, 59);
		System.out.println(Oobject.toMilitary());
		System.out.println(Oobject.toString());
		
		
		Otimes Oobject1 = new Otimes();
		Otimes Oobject2 = new Otimes(17);
		Otimes Oobject3 = new Otimes(18,19);
		Otimes Oobject4 = new Otimes(20,21,22);
		
		System.out.println("-----------------------");
		
		System.out.println(Oobject1.toMilitary());
		System.out.println(Oobject2.toMilitary());
		System.out.println(Oobject3.toMilitary());
		System.out.println(Oobject4.toMilitary());
		
		System.out.println("--------AM   PM--------");
		
		System.out.printf("%s\n",Oobject1.toString());
		System.out.printf("%s\n",Oobject2.toString());
		System.out.printf("%s\n",Oobject3.toString());
		System.out.printf("%s\n",Oobject4.toString());

	}

}
