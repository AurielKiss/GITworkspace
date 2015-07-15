import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlCrawlerTwo {

	public static void main(String[] args) throws Exception {

		
		URL delfi = new URL("http://grynas.delfi.lt/");
		BufferedReader in = new BufferedReader(new InputStreamReader(delfi.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}