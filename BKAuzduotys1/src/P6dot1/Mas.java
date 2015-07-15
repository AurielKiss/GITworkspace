package P6dot1;

public class Mas {

	public static void main(String[] args) {

//		Random rand = new Random();
		
// I masyva suraso random skaicius
		int visokie[] = new int[10];		
		for (int i=0; i<10; i++){
			visokie[i] = (int)(Math.random()*11);
		}
// Atspausdinam pirmini masyva		
		for (int tempo : visokie){
//		tempo = rand.nextInt(11);
//		tempo = (int)Math.random()*11;
		System.out.print(tempo+" ");	
	}
		
		System.out.println(); // nauja eilute
		
// Spausdina lygini indeksa		
		for (int i=0; i<10; i++){
		if ((i%2)==0){
		System.out.print(visokie[i]+" ");
		}
		}
			
	//	int x = rand.nextInt(6);
	//	int x = (int)(Math.random()*11);
	//	System.out.println(x);
		System.out.println(""); // nauja eilute
		
// Spausdina lyginius skaicius
		for (int i=0; i<10; i++){
			if ((visokie[i]%2)==0){
			System.out.print(visokie[i]+" ");
			}
			}
		System.out.println(); // nauja eilute
		
		// Spausdina visus atvirksciai
		for (int i=9; i>=0; i--){	
			System.out.print(visokie[i]+" ");
			}	

		
		
		System.out.println(); // nauja eilute
	
		// Spausdina 1 ir 10
		System.out.println(visokie[0]+" "+visokie[9]);
}
}
