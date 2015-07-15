

import java.util.ArrayList;
import java.util.List;

public class ArticleLinkExtractor {

	private static final String HEADLINE_CLASS = "category-headline-item";
	private static final String HEADLINE_URL_PREFIX = "<h3><a href=\"";
	private static final char HEADLINE_URL_SUFFIX = '\"';

	public List<String> getArticleLinks(String htmlContent) {
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
