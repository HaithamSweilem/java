package com.haitham.chatbot.iteration1;

import java.util.Scanner;


/**
 * Use Cases:
 * 1- Greet
 * 2- Farewell
 * 3- Ask a question
 * 4- Answer a question
 * 
 * Use Case 1: Greet
 *      
 *      Preconditions
 *      1. User opened the chat bot program in the command line
 *      2. Keyboard is the standard input
 * 
 *      Sequence of Events
 *      1. User types in a statement which starts with one of: "hello", "hi"
 *      2. Bot identifies input as a greeting
 *      3. Bot responds with one of: "hi", "hi there", "oh hi", "hello there"
 * 
 * Use Case 2: Farewell
 *      
 *      Preconditions
 *      1. User opened the chat bot program in the command line
 *      2. Keyboard is the standard input
 *      3. User already greeted the Bot (Use Case 1)
 * 
 *      Sequence of Events
 *      1. User types in a statement which contains any of: "farewell", "goodbye", "see you", "talk later"
 *      2. Bot identifies input as a farewell
 *      3. Bot responds with one of: "ok, goodbye", "nice talking to you", "thanks for having this conversation", "see you around", "talk to you later"
 * 
 * Use Case 3: Ask a question
 *      
 *      Preconditions
 *      1. User opened the chat bot program in the command line
 *      2. Keyboard is the standard input
 *      3. User already greeted the Bot (Use Case 1)
 * 
 *      Sequence of Events
 *      1. User types in a statement which starts with contains any of: 
 *          {"what", "where", "who", "how", "which", "is", "are", "was", "were", "will", "would", "can", "could", "shall", "should"}
 *          and ends with a question mark "?"
 *      2. Bot identifies input as a question
 *      3. Bot responds with either a straight answer, or an answer followed by a question
 * 
 * Use Case 4: Answer a question
 *      
 *      Preconditions
 *      1. User opened the chat bot program in the command line
 *      2. Keyboard is the standard input
 *      3. User was asked a question by Bot (Use Case 3)
 * 
 *      Sequence of Events
 *      1. User types in an answer
 *      2. Bot identifies input as an answer (not ending with a question mark "?")
 *      3. Bot responds with either a question, or a comment followed by a question
 * 
 */
public class Chatbot {

    protected String[] keywords;
    protected Scanner cin;

    public static void main(String[] args) {
        
        // create the bot object
        Chatbot bot = new Chatbot();

        String line = bot.getLineFromUser();

        // TODO: Questions for next iteration
        // 1- should we accept input in an infinite loop?
        // 2- how will the loop end?
    }

    /**
     * Initializes all member variables before they are used.
     * 
     */
    public Chatbot() {
        // define scanner
        cin = new Scanner(System.in);

        // show welcome message at the beginning of program
        System.out.println("Welcome to Bot, the intelligent and funny chatting program!");
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