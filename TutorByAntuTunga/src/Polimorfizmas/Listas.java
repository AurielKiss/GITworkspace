package Polimorfizmas;

public class Listas {
	
	private Tvartas[] thelist = new Tvartas[10];
	private int i = 0;
	
	public void add(Tvartas a){
		if(i<thelist.length){
			thelist[i] = a;
			System.out.println("Add index "+i);
			i++;
			
		}
		
	}

}
