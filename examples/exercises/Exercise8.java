package exercises;

public class Exercise8 {
    public static void main(String[] args) {

        String text = "If you don't like the road you're walking, start paving another one. The most beautiful things in the world cannot be seen or even touched. They must be felt with the heart. Life is a series of baby steps. Love yourself first and everything else falls into line. Don't give it five minutes if you're not going to give it five years.";
        
        // given character to search for
        char character = 'v';
        
        // Pseudo-Code: search for a character in text and print its position
        // -------------------------------------
        // set position counter to 0
        // for each character in the text
            // increment the position counter
            // if character equals the one we are searching for
                // print the character and the position counter
                // stop looping
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                System.out.println("Found " + character + " at " + i);
                break;
            }
        }

        // print all positions
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                System.out.println("Found " + character + " at " + i);
            }
        }

        
        // search for a word in text
        String woordToSearchFor = "walking";
        // String[] words = text.split(" ");
        String[] words = text.split("[, .;:]");
        int location = 0;
        int wordNumber = 0;
        for (String word : words) {
            
            if (word.equals(woordToSearchFor)) {
                System.out.println("Found " + character + " at " + location + ", word #" + wordNumber);
                break;
            }

            location += word.length();
            wordNumber++;
        }
    }
}
