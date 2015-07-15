import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class ClassNameGenerator {

	public static void main(String[] args) throws IOException {
		
		String line, temp, partA, partB, partC, randomName;
		
		int size, sizeA, sizeB, sizeC, randomA, randomB, randomC;
		int count1 = 0;
		int count2 = 0;
		
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> bList = new ArrayList<String>();
		ArrayList<String> cList = new ArrayList<String>();
		ArrayList<String> listA = new ArrayList<String>();
		ArrayList<String> listB = new ArrayList<String>();
		ArrayList<String> listC = new ArrayList<String>();
		ArrayList<String> finalArray = new ArrayList<String>();
		
		Random random = new Random();
		
		//  Puts words from the first file into an array listA 
		try{
			BufferedReader input = new BufferedReader (new FileReader ("D:/File1.txt"));
			if (!input.ready()){
				throw new IOException();
			}
			while ((line = input.readLine()) != null){
				aList.add(line);
			}
			input.close();
		}
		catch (IOException e){
			System.out.println(e);
		}
		size = aList.size();
		sizeA = size;
		for (int i = 0; i < size; i++){
			temp = aList.get(i).toString();
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
			listA.add(temp);
		}
		
		//  Puts words from the second file into an array listB
		try{
			BufferedReader input = new BufferedReader (new FileReader ("D:/File2.txt"));
			if (!input.ready()){
				throw new IOException();
			}
			while ((line = input.readLine()) != null){
				bList.add(line);
			}
			input.close();
		}
		catch (IOException e){
			System.out.println(e);
		}
		size = bList.size();
		sizeB = size;
		for (int i = 0; i < size; i++){
			temp = bList.get(i).toString();
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
			listB.add(temp);
		}
		
		//  Puts words from the third file into an array listC
		try{
			BufferedReader input = new BufferedReader (new FileReader ("D:/File3.txt"));
			if (!input.ready()){
				throw new IOException();
			}
			while ((line = input.readLine()) != null){
				cList.add(line);
			}
			input.close();
		}
		catch (IOException e){
			System.out.println(e);
		}
		size = cList.size();
		sizeC = size;
		for (int i = 0; i < size; i++){
			temp = cList.get(i).toString();
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
			listC.add(temp);
		}
		
		for (int i = 0; i < 5000; i++){
			
			//  Generates 3 different random numbers to use for Class Name Generation
			randomA = random.nextInt(sizeA);
			randomB = random.nextInt(sizeB);
			randomC = random.nextInt(sizeC);
				
			partA = listA.get(randomA);
			partB = listB.get(randomB);	
			partC = listC.get(randomC);
			
			randomName = partA + partB + partC;
						
			//  Checks if there will be no duplication in the final array if the name would be put in it and of there are none, puts the Random Name into the Final Array
			if (finalArray.contains(randomName)){
				count1++;
				}
				else{
					finalArray.add(randomName);
					count2++;
				}
			}
			
			System.out.println("number of Names in the Final Array: " + count2);
			System.out.println("number of Duplicates generated:     " + count1);
			
			//  Puts Class Names from the Final Array into a text file
			BufferedWriter writer = new BufferedWriter (new FileWriter("D:/GeneratedClassNames.txt"));
			for(String str: finalArray) {
				writer.write(str);
				writer.newLine();
			}
			writer.close();
		
	}

}
