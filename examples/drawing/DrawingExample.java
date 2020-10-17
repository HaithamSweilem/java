package drawing;

public class DrawingExample {
    
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
        
        // advance one page further
        currentPage = targetPage;
        targetPage++;
        nextPageUrl = getNextPageURL(5, 105, totalPages);
        System.out.println(nextPageUrl);
    }

    static String getNextPageURL(int currentPage, int targetPage, int totalPages) {
        
        // define the main URL with a '?' at the end, but without pagination information
        String mainUrl = "https://www.w3schools.com/intro-to-java?";

        // validation the required target page if it falls within the range of total pages
        if (targetPage < totalPages || targetPage > totalPages) {
            return mainUrl;
        }

        // build pagination
        String pagination = "previous=" + currentPage
            + "&page=" + targetPage
            + "&next=" + (targetPage + 1);

        // concatenate strings
        String resultUrl = mainUrl + pagination;

        // return result URL
        return resultUrl;
    }
}

class Cube {


    public static void main(String[] args) {
        int length = 10; // in meters
        
        Cube cube = new Cube();
        cube.draw(length);
    }
    void draw(int length) {
        drawFace(length, "top");
        drawFace(length, "bottom");
        drawFace(length, "right");
        drawFace(length, "left");
        drawFace(length, "front");
        drawFace(length, "back");
    }

    void drawFace(int length, String orientation) {
        switch (orientation) {
            case "top":
                drawBase(length, "xy");
        }
    }

    void drawBase(int length, String type) {
        switch (type) {
            case "x":  drawLine(length, new int[] {0, 0, 0}, new int[] {1, 0, 0}); break;
            case "y":  drawLine(length, new int[] {0, 0, 0}, new int[] {0, 1, 0}); break;
            case "xy": drawLine(length, new int[] {1, 0, 0}, new int[] {1, 1, 0}); break;
            case "yx": drawLine(length, new int[] {0, 1, 0}, new int[] {1, 1, 0}); break;
        }
    }

    void drawCeiling(int length, String type) {
        switch (type) {
            case "x":  drawLine(length, new int[] {0, 0, 1}, new int[] {1, 0, 1}); break;
            case "y":  drawLine(length, new int[] {0, 0, 1}, new int[] {0, 1, 1}); break;
            case "xy": drawLine(length, new int[] {1, 0, 1}, new int[] {1, 1, 1}); break;
            case "yx": drawLine(length, new int[] {0, 1, 1}, new int[] {1, 1, 1}); break;
        }
    }

    void drawPillar(int length, String type) {
        switch (type) {
            case "x":  drawLine(length, new int[] {1, 0, 0}, new int[] {1, 0, 1}); break;
            case "y":  drawLine(length, new int[] {0, 1, 0}, new int[] {0, 1, 1}); break;
            case "z":  drawLine(length, new int[] {0, 0, 1}, new int[] {0, 0, 1}); break;
            case "xy": drawLine(length, new int[] {1, 1, 0}, new int[] {1, 1, 1}); break;
        }
    }

    void drawLine(int length, int[] fromXYZ, int[] toXYZ) {

        int[][][] space = new int[length][length][length];

        

        // TODO: implement code here
        // ...

    }
}

