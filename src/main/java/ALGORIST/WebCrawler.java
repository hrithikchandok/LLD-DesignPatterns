import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// This is the HtmlParser's API interface.
// You should not implement it, or speculate about its implementation
interface HtmlParser {
    List<String> getUrls(String url);
}

public class Solution {
  
    private Set<String> crawledUrls; // To store unique crawled URLs

    // The crawl method initiates the crawling process from a startUrl
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        crawledUrls = new HashSet<>();
        depthFirstSearch(startUrl, htmlParser);
        return new ArrayList<>(crawledUrls); // Convert the set of URLs to a list before returning
    }
  
    // Helper method to perform depth-first search on the web page's links
    private void depthFirstSearch(String url, HtmlParser htmlParser) {
        // Check if the url is already visited to avoid loops
        if (crawledUrls.contains(url)) {
            return;
        }
      
        // Mark the current URL as visited
        crawledUrls.add(url);
      
        // Iterate through all URLs obtained from the current page
        for (String nextUrl : htmlParser.getUrls(url)) {
            // Only continue crawling if the next URL has the same host as the start URL
            if (extractHostName(nextUrl).equals(extractHostName(url))) {
                depthFirstSearch(nextUrl, htmlParser); // Recursively visit the next URL
            }
        }
    }

    // Helper method to extract the host name from a given URL
    private String extractHostName(String url) {
        // Removing the protocol ("http://") part of the URL to get the hostname with possible path
        String urlWithoutProtocol = url.substring(7);
      
        // Split the hostname and path and return the hostname part
        return urlWithoutProtocol.split("/")[0];
    }
}
