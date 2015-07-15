import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UrlCrawler {

	private static final String URL = "http://www.delfi.lt/news/daily/education/";
	private static final String HEADLINE_URL_PREFIX = "<h3><a href=\"";
	private static final char HEADLINE_URL_SUFFIX = '\"';
	private static final String ANON_COMMENT_COUNT_PREFIX = "Anonimiški <span>(";
	private static final char ANON_COMMENT_COUNT_SUFFIX = ')';

	private static final String HEADLINE_CLASS = "category-headline-item"; //WTF???

	public static void main(String[] args) throws Exception {

		URL linkURL = new URL(URL);

		String content = UrlToString(linkURL);
		List<String> articleLinks = extractArticleLinks(content);

		// collect URLs and comment counts in a Map
		Map<String, Integer> result = new LinkedHashMap<>();
		for (String articleUrl : articleLinks) {
			int commentCount = extractAnonymousCommentCount(articleUrl);
			result.put(articleUrl, commentCount);
		}

		// Print results from the map
		for (Entry<String, Integer> resultEntry : result.entrySet()) {
			System.out.println(resultEntry.getValue() + " anon comments for article " + resultEntry.getKey());
		}

	}

	public static String UrlToString(URL url) throws Exception {
		Objects.requireNonNull(url, "The url cannot be null.");
		try (InputStream is = url.openStream();

		Scanner sc = new Scanner(is)) {
			sc.useDelimiter("\\A");
			if (sc.hasNext())
				return sc.next();
			else
				return null;
		}

	}

	private static List<String> extractArticleLinks(String htmlContent) {
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

	private static int extractAnonymousCommentCount(String articleUrl) throws Exception {
		String articleContent = articleToString(articleUrl);

		int commentCountStartIndex = articleContent.indexOf(ANON_COMMENT_COUNT_PREFIX) + ANON_COMMENT_COUNT_PREFIX.length();
		int commentCountEndIndex = articleContent.indexOf(ANON_COMMENT_COUNT_SUFFIX, commentCountStartIndex);
		String commentCount = articleContent.substring(commentCountStartIndex, commentCountEndIndex);

		return Integer.parseInt(commentCount);
	}

	private static String articleToString(String url) throws Exception {
		URL website = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));

		StringBuilder response = new StringBuilder();

		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		in.close();

		return response.toString();
	}

}
