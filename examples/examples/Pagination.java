package examples;

public class Pagination {
    public static void main(String[] args) {
        
        // define some variables
        int currentPage = 5;
        int targetPage = 6;
        int totalPages = 100;

        // define result with initial empty value
        String nextPageUrl = "";

        // pass the variables as arguments to the method
        nextPageUrl = getNextPageURL(currentPage, targetPage, totalPages);
        System.out.println(nextPageUrl);
        
        currentPage = targetPage;   // update current page
        targetPage++;               // advance one page further

        nextPageUrl = getNextPageURL(currentPage, targetPage, totalPages);
        System.out.println(nextPageUrl);
    }

    static String getNextPageURL(int currentPage, int targetPage, int totalPages) {

        // define the main URL with a '?' at the end, but without pagination information
        String mainUrl = "https://www.w3schools.com/intro-to-java?";

        // validate the required target page if it falls within the range of total pages
        if (targetPage < 0 && targetPage > totalPages) {
            return mainUrl;
        }

        // build pagination
        String pagination = "previous=" + currentPage
            + "&page=" + targetPage
            + "&next=" + (targetPage = 1);

        // concatenate strings
        String resultUrl = mainUrl + pagination;

        // return result URL
        return resultUrl;
        
    }
}

