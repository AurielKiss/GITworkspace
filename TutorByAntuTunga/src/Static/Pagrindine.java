package Static;

public class Pagrindine {

	public static void main(String[] args) {
		Klubas member1 = new Klubas("Petras", "Petraitis");
		Klubas member2 = new Klubas("Jonas", "Jonis");
		Klubas member3 = new Klubas("Gytis", "Grigis");
		
		System.out.println("-------------------------------");
		System.out.print(member1.getFirst()+"\t");
		System.out.println("Nariu yra: "+member1.getMembers());
		System.out.println("-------------------------------");
		System.out.print(member2.getFirst()+"\t");
		System.out.println("Nariu yra: "+member2.getMembers());
		System.out.println("-------------------------------");
		System.out.print(member3.getFirst()+"\t");
		System.out.println("Nariu yra: "+member3.getMembers());
		System.out.println("-----------per klase----------");
		System.out.println("Nariu yra: "+Klubas.getMembers());

	}

}
