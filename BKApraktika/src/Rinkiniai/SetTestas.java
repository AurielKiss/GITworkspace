package Rinkiniai;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestas {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		Set<String> t = new HashSet<>();
		t.add("ABC");
		t.add("BCD");
		t.add("CDE");
		t.add("BBC");
		s.add("ABC");
		s.add("EDF");
		s.add("BCD");
		s.add("BBC");
		Iterator<String> iter = t.iterator();

		// isrinkti zodzius, kuriuos sutinkame abiejuose setuose
		while (iter.hasNext()) {
			String a = iter.next();
			if (s.contains(a))
				System.out.println(a);
		}

	}
}