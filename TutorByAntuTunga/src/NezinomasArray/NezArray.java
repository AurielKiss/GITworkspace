package NezinomasArray;

public class NezArray {

	public static void main(String[] args) {
		System.out.println(average(5,7,10,1,1,1,1));
	}

	public static int average(int ...numbers){
		int total = 0;
		for(int x:numbers)
			total+=x;
		return total/numbers.length;
		
	}
}
