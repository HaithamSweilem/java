package com.haitham.chatbot.iteration4;

import java.util.Random;
import java.util.Scanner;

public class Chatbot {

    protected static final int LINE_NOT_RECOGNIZED = -1;
    protected static final int LINE_IS_GREETING = 0;
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

            // recognize a greeting
            int inputType = recognizeLine(line);
            // respond to a greeting
            takeDecision(inputType);

            line = getLineFromUser();
        }
    }

    protected void takeDecision(int inputType) {
        // define greeting responses
        String[] greetingResponses = new String[] {
            "Hi!", "Hi there!", "Oh! Hi!", "Good to see you!", "Hello there!",
            "Long time no see!", "Hi! It's been a while!"
        };
        
        if (inputType == LINE_IS_GREETING) {
            // respond with one of: "hi", "hi there", "oh hi", "hello there"
            System.out.println(greetingResponses[new Random().nextInt(greetingResponses.length)]);
        }
    }

    /**
     * Recognizes the line as a greeting if it starts with one of: "hello", "hi"
     * (case insensitive).
     * 
     * @param line the string to analyze
     * @return LINE_IS_GREETING if it is a greeting line or LINE_NOT_RECOGNIZED
     *         otherwise
     */
    protected int recognizeLine(String line) {

        if (line.toLowerCase().startsWith("hello") || line.toLowerCase().startsWith("hi")) {
            return LINE_IS_GREETING;
        }
        
        return LINE_NOT_RECOGNIZED;
    }

    /**
     * Checks if the input line is an exit line, i.e. equals "exit" or "quit" (case
     * insensitive).
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