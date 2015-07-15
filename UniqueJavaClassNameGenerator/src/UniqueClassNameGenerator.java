import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class UniqueClassNameGenerator {

	//Failu pavadinimus bei kelia iki ju pasikeiskite pagal savo poreikius:
	private static final String GENERATOR_FILES_PATH = "C:\\JAVAworkspace\\UniqueJavaClassNameGenerator\\files\\";	//Kelias iki katalogo
	private static final String GENERATOR_INPUT_1_FILE_NAME = "Failas1.txt";	//Pirmo skaitomo failo pavadinimas
	private static final String GENERATOR_INPUT_2_FILE_NAME = "Failas2.txt";	//Antro skaitomo failo pavadinimas
	private static final String GENERATOR_INPUT_3_FILE_NAME = "Failas3.txt";	//Trecio skaitomo failo pavadinimas
	private static final String GENERATOR_OUTPUT_FILE_NAME = "OutputFile.txt";	//Failas i kuri rasysime sugeneruotus pavadinimus
	private static final Charset ENCODING = StandardCharsets.UTF_8;

	private List<String> arrayList;
	private List<String> fullRandomArrayList;

	public static void main(String[] args) {

		UniqueClassNameGenerator genObject1 = new UniqueClassNameGenerator();
		UniqueClassNameGenerator genObject2 = new UniqueClassNameGenerator();
		UniqueClassNameGenerator genObject3 = new UniqueClassNameGenerator();

		genObject1.fileContentToList(GENERATOR_FILES_PATH + GENERATOR_INPUT_1_FILE_NAME);
		genObject2.fileContentToList(GENERATOR_FILES_PATH + GENERATOR_INPUT_2_FILE_NAME);
		genObject3.fileContentToList(GENERATOR_FILES_PATH + GENERATOR_INPUT_3_FILE_NAME);

		genObject1.randomNameListGenerator(genObject1.arrayList, genObject2.arrayList, genObject3.arrayList, 5000);

		helloAuthor();

		listToFileWriter(listDuplicatesFilter(genObject1.fullRandomArrayList), GENERATOR_FILES_PATH + GENERATOR_OUTPUT_FILE_NAME);

	}

	// Metodas skaito is failo, kurio pavadinima paduodame ir uzpildo ArrayList'a (liList).
	public void fileContentToList(String file) {

		ArrayList<String> list = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(new File(file));
			while (scan.hasNext()) {
				list.add(scan.next());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error! " + e);
		}
		this.arrayList = list;
	}

	// Metodui reikia paduoti 3 listus ir norimą sugeneruoti zozdiu kieki. Sugeneruoja (fullRandomList) apjungdamas paduotu 3 listu narius.
	public void randomNameListGenerator(List<String> listA, List<String> listB, List<String> listC, int i) {

		ArrayList<String> finalList = new ArrayList<String>();
		Random rand = new Random();

		for (int j = 0; j < i; j++) {

			String A = listA.get(rand.nextInt(listA.size()));
			String B = listB.get(rand.nextInt(listB.size()));
			String C = listC.get(rand.nextInt(listC.size()));

			finalList.add(A + B + C);
		}
		this.fullRandomArrayList = finalList;
	}

	// Metodas grazina List stringa be dublikatu. Atspausdina dublikatu skaiciu.
	public static List<String> listDuplicatesFilter(List<String> list) {

		Set<String> set = new HashSet<String>(list);
		List<String> newList = new ArrayList<String>(set);

		int numDuplicates = list.size() - set.size();
		System.out.println("\tDuplicates filter ON.\t\tDuplicates deleted: <" + numDuplicates + ">");

		return newList;
	}

	// Metodas String Lista iraso i faila. Jei nera failo - sukuria.
	public static void listToFileWriter(List<String> list, String file) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), ENCODING));
			for (String str : list) {
				writer.write(str + "\t");
			}
		} catch (IOException ex) {
			System.out.println("Error! " + ex);
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
				System.out.println("Error! " + ex);
			}
		}
	}

	// Metodas prisistatymui
	public static void helloAuthor() {
		System.out.println("\n\tJAVA CLASS NAME GENERATOR\tauthor: Aurelijus Kutra\n");
	}

}
