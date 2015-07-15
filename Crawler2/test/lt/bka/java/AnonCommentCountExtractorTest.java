package lt.bka.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is a unit test class which is run by JUnit library.<br>
 * 
 * It's sole purpose is to test whether AnonCommentCountExtractor works correctly (i.e. returns expected results for some fixed data)
 *
 */
public class AnonCommentCountExtractorTest {

	// create an object we want to test
	private AnonCommentCountExtractor extractor = new AnonCommentCountExtractor();

	// This is the first test case
	@Test
	public void testCommentExtraction() {
		// Take a fixed input
		String htmlPage = "nclick=\"CommentList.switchThread(event, 1)\">Anonimiški <span>(22)</span></a>	<div class=\"clearfix\"></div>";

		// Execute logic which is being tested
		int count = extractor.getCommentCount(htmlPage);

		// Assert that result received is what we expected
		Assert.assertEquals("AnonCommentCountExtractor did not get the right count!", 22, count);
	}

	// This is another test case (tests the same functionality with different data)
	@Test
	public void testCommentExtraction2() {
		String htmlPage = "nclick=\"CommentList.switchThread(event, 1)\">Anonimiški <span>(3)</span></a>	<div class=\"clearfix\"></div>";

		int count = extractor.getCommentCount(htmlPage);

		Assert.assertEquals("AnonCommentCountExtractor did not get the right count!", 3, count);
	}
}
