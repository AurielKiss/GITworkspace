package Bardakas;

import java.util.Arrays;

public class Bardakas {

	public static void main(String[] args) {
int a,b,c;
byte B=0;
a=b=c=6;
b=((a*c)+(2*a*c))/3;
System.out.println("b=((a*c)+(2*a*c))/3");
System.out.println(b+"=(("+a+"*"+c+")+(2*"+a+"*"+c+"))/3");
//uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu
B=(byte)(B+10);
System.out.println(B);
String s1 = new String("Hello");
System.out.println(s1);
int array1[][] = new int [5][];
array1[0] = new int[2];
array1[1] = new int[2];
array1[0][0]=9;
array1[0][1]=10;
array1[1][0]=1;
array1[1][1]=2;

System.out.println(array1.length);
System.out.println(Arrays.deepToString(array1));

for(int C=0;C<=10;C++){
	System.out.print(C+" + ");
	if (C==9){System.out.println("STOPas");
		break;
	}	
}


	}

}
