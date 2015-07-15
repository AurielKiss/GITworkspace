package PolyAbstract;

public class Pintine {

	public static void main(String[] args) {
		
		Food maistas[] = new Food[2];
		maistas[0] = new Fish();
		maistas[1] = new Meet();
		
		for(int x=0; x<2; ++x){
			maistas[x].eat();
		}
		System.out.println("-----------------------");
		
		Fatty fa = new Fatty();	
		//Food fo = new Food();
		Food fi = new Fish();
		Food me = new Meet();
		
		//fa.digest(fo);
		fa.digest(fi);
		fa.digest(me);
		

	}

}
