package examples.string;

import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
        
        String absoluteFilePath = "c:/Users/user123/Program Files/file.txt";
        
        String driveC = "C:";
        String driveD = "D:";

        p("-------------------------------- 1 --------------------------------");
        p("charAt  0 ? " + absoluteFilePath.charAt(0));
        p("charAt -1 ? " + absoluteFilePath.charAt(-1));
        p("-------------------------------- 2 --------------------------------");
        p("Path contains \"9\"? " + absoluteFilePath.contains("9"));
        p("Path contains \"2\"? " + absoluteFilePath.contains("2"));
        p("-------------------------------- 3 --------------------------------");
        p("Index of 'z' in path " + absoluteFilePath.indexOf('z'));
        p("Index of 'e' in path " + absoluteFilePath.indexOf('e'));
        p("Index of \"123\" in path " + absoluteFilePath.indexOf("123"));
        p("-------------------------------- 4 --------------------------------");
        p("Path starts with " + driveC + "? " + absoluteFilePath.startsWith(driveC));
        p("Path starts with " + driveD + "? " + absoluteFilePath.startsWith(driveD));
        p("--------------------------------   --------------------------------");
        p("Path starts with " + driveC + "? " + absoluteFilePath.toLowerCase().startsWith(driveC.toLowerCase()));
        p("Path starts with " + driveD + "? " + absoluteFilePath.toLowerCase().startsWith(driveD.toLowerCase()));
        p("-------------------------------- 5 --------------------------------");
        String txtFileExtension = "txt";
        String pngFileExtension = "png";
        p("File is txt? " + absoluteFilePath.endsWith(txtFileExtension));
        p("File is png? " + absoluteFilePath.endsWith(pngFileExtension));
        p("-------------------------------------------------------------------");
    }

    static void p(String str) {
        System.out.println(str);
    }

    static void tokenizeBySplit(String text, String regex) {
        // split according to regex or delimiter
        String[] tokens = text.split(regex);
        // for each token
        for (String token : tokens) {
            // print token with indent
            System.out.println(token);
        }
    }

    static void tokenizeByTokenizer(String absoluteFilePath) {
        // create tokenizer object
        StringTokenizer tokenizer = new StringTokenizer(absoluteFilePath);
        // loop on tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

