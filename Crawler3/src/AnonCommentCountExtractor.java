

/**
 * This class has a single responsibility - parse given HTML contents and return the comment count.<br>
 * Everything required for that is contained in this class, so this functionality can be tested independently
 * 
 * @see AnonCommentCountExtractorTest - a class testing the behaviour of this class
 */
public class AnonCommentCountExtractor {

	private static final String ANON_COMMENT_COUNT_PREFIX = "Anonimiški <span>(";
	private static final char ANON_COMMENT_COUNT_SUFFIX = ')';

	public int getCommentCount(String htmlPage) {
		// find the index of the first comment number digit (index after ["Anonimiški <span>(] + its length)
		int commentCountStartIndex = htmlPage.indexOf(ANON_COMMENT_COUNT_PREFIX) + ANON_COMMENT_COUNT_PREFIX.length();

		// end index is the first closing bracket, when looked from the start of the comment count 
		int commentCountEndIndex = htmlPage.indexOf(ANON_COMMENT_COUNT_SUFFIX, commentCountStartIndex);

		// comment number is in between start and end indices
		String commentCountString = htmlPage.substring(commentCountStartIndex, commentCountEndIndex);

		return Integer.parseInt(commentCountString);
	}
}
