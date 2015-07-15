package Rinkiniai;

import java.util.LinkedList;
import java.util.ListIterator;
import static java.lang.System.out;

public class LinkedListTestas {

	public static void main(String[] args) {

		LinkedList<String> words = new LinkedList<>();
		words.add("ABCD");
		words.add("B");
		words.add("CDEFSF");
		words.add("BBC");
		words.add("bbbbbcd");
		words.add("AFFFAF");
		out.println(words);

		// istrinti zodzius, kuriu ilgis nesiekia 4
		ListIterator<String> iter = words.listIterator();
		while (iter.hasNext()) {
			if (iter.next().length() < 4)
				iter.remove();
		}
		out.println(words);

		// istrinti kas antra elementa
		iter = words.listIterator();
		while (iter.hasNext()) {
			iter.next();
			if (iter.hasNext()) {
				iter.next();
				iter.remove();
			}
		}
		out.println(words);

		// iter = words.listIterator();
		// while(iter.hasNext()) {
		// iter.next();
		// if(iter.hasNext()) {
		// iter.next();
		// iter.remove();
		// }
		// }
		//
		// out.println(words);

	}

}
