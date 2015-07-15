package Enum;

import java.util.EnumSet;

/**
 * 
 * @author AurielKiss
 *
 */

public class Pradzia {

	public static void main(String[] args) {
		for(Enum peoples:Enum.values())
			System.out.printf("%s\t%s\t%s\n",peoples, peoples.getDesc(), peoples.getYear());
		
		System.out.println("\n---- Constants range----\n");
		
		for(Enum people:EnumSet.range(Enum.Jonas, Enum.Mykolas))
			System.out.printf("%s\t%s\t%s\n",people, people.getDesc(), people.getYear());

	}

}
