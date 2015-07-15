package Polimorfizmas;

public class Kaimas {

	public static void main(String[] args) {

		Tvartas[] sarasas = new Tvartas[3];
		
		Karves k = new Karves();
		Sunys s = new Sunys();
		Vistos v = new Vistos();
		
		sarasas[0] = k;
		sarasas[1] = s;
		sarasas[2] = v;
		
		for (Tvartas temp:sarasas){
			temp.garsas();
		}
		
		System.out.println("-----------------");
		
		Listas li = new Listas();
		li.add(k);
		li.add(k);
		li.add(v);
		
	}

}
