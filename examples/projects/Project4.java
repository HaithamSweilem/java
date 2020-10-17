package projects;

public class Project4 {

    public static void main(String[] args) {

        String[] menu = new String[] {
            "Draw a line",
            "Draw a triangle",
            "Draw a square",
            "Draw a cube",
        };

        String input = null;

        while (inputIsNotExit(input)) {

            handleInput(input, menu.length);

            printMenu(menu);

            input = getInput();
        }

    }

    static void handleInput(String input, int menuLength) {

        if (input == null) {
            return;
        }

        try {

            int option = Integer.parseInt(input);
            if (option <= 0 || option > menuLength) {
                System.out.println("Invalid option");
                return;
            }

            // TODO: handle option
            // ...
            System.out.println("You chose " + option);

        } catch (Exception e) {
            System.out.println("Error parsing option");
            return;
        }
    }

    static boolean inputIsNotExit(String input) {
        if (input == null) {
            return true;
        }

        return !input.toLowerCase().equals("exit") && !input.toLowerCase().equals("quit")
            && !input.toLowerCase().equals("q");
    }

    static void printMenu(String[] menu) {
        for (int i = 1; i <= menu.length; i++) {
            System.out.println(i + ". " + menu[i - 1]);
        }

        System.out.println("Please choose an option from the menu...");
    }

    static String getInput() {
        return (new java.util.Scanner(System.in)).nextLine();
    }
}
