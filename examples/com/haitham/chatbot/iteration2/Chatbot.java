package com.haitham.chatbot.iteration2;

import java.util.Scanner;

public class Chatbot {

    protected String[] keywords;
    protected Scanner cin;

    public static void main(String[] args) {
        
        // create the bot object
        Chatbot bot = new Chatbot();
        bot.run();

    }

    protected void run() {
        
        String line = getLineFromUser();
        
        // keep looping for input until user exits the program
        while ( ! isInputLineAnExit(line) ) {

            // TODO: Questions for next iteration
            // 1- how to recognize a greeting?
            // 2- how to respond to a greeting?

            line = getLineFromUser();
        }
    }

    /**
     * Checks if the input line is an exit line, i.e. equals "exit" or "quit" (case insensitive).
     * 
     * @param line input line we get from user
     * @return true if line is an exit line, false otherwise
     */
    protected boolean isInputLineAnExit(String line) {
        
        // trim line and convert to small letters
        line = line.trim().toLowerCase();

        return line.equals("quit") || line.equals("exit");
    }

    /**
     * Initializes all member variables before they are used.
     * 
     */
    public Chatbot() {
        // define scanner
        cin = new Scanner(System.in);

        // show welcome message at the beginning of program
        System.out.println("Welcome to Bot, the intelligent and funny chatting program! Type 'quit' or 'exit' and press Enter to exit the program.");
    }

    /**
     * Closes the Scanner object to prevent possible memory leaks.
     * 
     */
    public void close() {
        cin.close();
    }

    /**
     * Retrives a single line from standard input (keyboard) and returns it
     * 
     * @return a String representing a single line of input
     */
    public String getLineFromUser() {
        return cin.nextLine();
    }
    
}