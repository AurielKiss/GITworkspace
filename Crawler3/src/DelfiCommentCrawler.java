

import java.io.IOException;
import java.util.List;

public class DelfiCommentCrawler {

	protected static final String CATEGORY_URL = "http://www.delfi.lt/news/daily/education/";

	private HtmlContentReader htmlContentReader = new HtmlContentReader();
	private ArticleLinkExtractor articleLinkExtractor = new ArticleLinkExtractor();
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
		String content = htmlContentReader.readContent(CATEGORY_URL);
		List<String> articleLinks = articleLinkExtractor.getArticleLinks(content);

		// collect URLs and comment counts in a Map
		for (String articleUrl : articleLinks) {
			String articleContent = htmlContentReader.readContent(articleUrl);
			int commentCount = commentCountExtractor.getCommentCount(articleContent);
			System.out.println(commentCount + " anon comments for article " + articleUrl);
		}
	}

}
