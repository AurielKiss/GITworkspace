import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DelfiCommentCrawler {

	private static final String URL = "http://www.delfi.lt/news/daily/education/";
	private static final String HEADLINE_CLASS = "category-headline-item";
	private static final String HEADLINE_URL_PREFIX = "<h3><a href=\"";
	private static final char HEADLINE_URL_SUFFIX = '\"';

	private AnonCommentCountExtractor commentCountExtractor = new AnonCommentCountExtractor();

	/**
	 * This method creates the crawler object and calls its method, which contains all of the logic
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		DelfiCommentCrawler crawler = new DelfiCommentCrawler();
		crawler.crawl();
	}

	public void crawl() throws IOException {
		String content = getContent(URL);
		List<String> articleLinks = extractArticleLinks(content);

		// collect URLs and comment counts in a Map
		Map<String, Integer> result = new LinkedHashMap<>();
		for (String articleUrl : articleLinks) {
			String articleContent = getContent(articleUrl);
			int commentCount = commentCountExtractor.getCommentCount(articleContent);
			result.put(articleUrl, commentCount);
		}

		// Print results from the map
		for (Entry<String, Integer> resultEntry : result.entrySet()) {
			System.out.println(resultEntry.getValue() + " anon comments for article " + resultEntry.getKey());
		}
	}

	/**
	 * Reads content from given URL into string.<br>
	 * Note: Utility class from some library could be used instead of this method.
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	private String getContent(String url) throws IOException {
		URL website = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream(), StandardCharsets.UTF_8));

		StringBuilder response = new StringBuilder();

		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		in.close();

		return response.toString();
	}

	private List<String> extractArticleLinks(String htmlContent) {
		List<String> articleLinks = new ArrayList<>();

		// find first headline
		int headlineClassIndex = htmlContent.indexOf(HEADLINE_CLASS);

		while (headlineClassIndex > 0) {		// while a headline exists
			int urlStartIndex = htmlContent.indexOf(HEADLINE_URL_PREFIX, headlineClassIndex) + HEADLINE_URL_PREFIX.length();	// Article URL starts after: <h3><a href="
			int urlEndIndex = htmlContent.indexOf(HEADLINE_URL_SUFFIX, urlStartIndex);											// Article URL ends before the closing href attribute quote
			String articleUrl = htmlContent.substring(urlStartIndex, urlEndIndex);
			articleLinks.add(articleUrl);

			// get the index of next headline
			headlineClassIndex = htmlContent.indexOf(HEADLINE_CLASS, urlEndIndex);
		}

		return articleLinks;
	}

}
