package Keyboard;

import java.util.Arrays;

public class Keyboard {

	public static void main(String[] args) {
		
		 String a[][] = {   {" "," ","A"," "," "},
				 			{" ","A"," ","A"," "},
				 			{"A"," "," "," ","A"},
				 			{"A","A","A","A","A"},
				 			{"A"," "," "," ","A"},
				 			{"A"," "," "," ","A"},
				 			{"A"," "," "," ","A"} };		
		 
		 String b[][] = {   {"B","B","B","B"," "},
				 			{"B"," "," "," ","B"},
				 			{"B"," "," "," ","B"},
				 			{"B","B","B","B"," "},
				 			{"B"," "," "," ","B"},
				 			{"B"," "," "," ","B"},
				 			{"B","B","B","B"," "} };		
		
		 for(String[] temp : a){
		 System.out.println(Arrays.toString(temp));	
		 }
		 
		 System.out.println("");
		 
		 for(String[] temp : b){
		 System.out.println(Arrays.toString(temp));	
		 }
		
		
/*				
	}	
	Printas();
	}
	
	public class Sifras{
	
	public String ai[][] = {  {null ,null ,"A" ,null ,null},
		    	{null, "A" ,null ,"A" ,null},
				{"A",null ,null ,null ,"A"},
				{"A", "A", "A", "A", "A"},
				{"A",null ,null ,null ,"A"},
				{"A",null ,null ,null ,"A"},
				{"A",null ,null ,null ,"A"} };
	
public void Printas() {
	System.out.println("ghjghjg");
}
Printas();
*/	
	}
}
