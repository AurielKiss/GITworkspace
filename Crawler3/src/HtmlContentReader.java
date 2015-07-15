

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HtmlContentReader {

	public String readContent(String url) throws IOException {
		String filePathString = getPathForUrl(url);
		Path path = Paths.get(filePathString);

		if (Files.notExists(path)) {
			// file does not exist yet, download the content and store it locally
			System.out.println("Downloading and storing to cache");
			String content = getRemoteContent(url);

			Files.createDirectories(path.getParent());
			Files.write(path, content.getBytes(StandardCharsets.UTF_8));

			return content;
		} else {
			// file exists, return locally cached content
			System.out.println("Reading from cache");
			byte[] contentBytes = Files.readAllBytes(path);
			return new String(contentBytes, StandardCharsets.UTF_8);

		}
	}

	// Note: this method is not private, so it could be tested from another class
	protected String getPathForUrl(String url) {
		String articleIdentifier;

		if (url.contains("?id=")) {
			// for article URL
			int articleIdStartIndex = url.lastIndexOf('=') + 1;
			articleIdentifier = url.substring(articleIdStartIndex);
		} else {
			// for category URL
			articleIdentifier = "categoryRoot";
		}

		return "cache/" + articleIdentifier + ".html";
	}

	/* This is an alternative hashcode-based file path generation algorithm.
	 * Negative hashcode values would also work fine for file names, however having only positive values looks better */
	private String getHashcodeBasedPathForUrl(String url) {
		return "cache/" + Math.abs(url.hashCode()) + ".html";
	}

	/**
	 * Reads content from given URL into string.<br>
	 * Note: Utility class from some library could be used instead of this method.
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	private String getRemoteContent(String url) throws IOException {
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
}
