package Mastery;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {
        final String FLAG = "!";

        // Create a File object with the name of your file as the parameter
        File wordFile = new File("words.txt");

        // Declare a File reader object
        FileReader fileReader = null;

        // Declare a BufferedReader object
        BufferedReader bufferedReader = null;

        // Create a random number object
        Random random = new Random();

        int numWords = 0, wordToGuess = 0;
        String secretWord = "";
        String wordSoFar = "", updatedWord = "";
        String letterGuess = "", wordGuess = "";
        int numGuesses = 0;

        /* select secret word */
        try {
            // Initialize the file reader object to the name of the file object
            fileReader = new FileReader(wordFile);

            // Initialize the BufferedReader object to the name of the file reader as a parameter
            bufferedReader = new BufferedReader(fileReader);

            // Get the number of words in the file by counting lines
            String line = bufferedReader.readLine();
            while (line != null) {
                numWords++;
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();

            // Update the word to guess using the random object and number of words
            wordToGuess = random.nextInt(numWords) + 1;

            // Re-open file to read up to the chosen random word slot
            fileReader = new FileReader(wordFile);
            bufferedReader = new BufferedReader(fileReader);

            // Iterate through the word to guess slots
            for (int i = 1; i <= wordToGuess; i++) {
                // Update the secret word from the lines read from the file
                secretWord = bufferedReader.readLine();
            }
            if (secretWord != null) {
                secretWord = secretWord.trim().toUpperCase();
            }

            // Close your BufferedReader object and FileReader object
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file.");
            System.err.println("IOException: " + e.getMessage());
        }

        Scanner input = new Scanner(System.in);

        /* begin the game */
        System.out.println("WordGuess game.\n");

        // Iterate through the secret word, and update the word so far variable to represent using dashes
        for (int i = 0; i < secretWord.length(); i++) {
            wordSoFar += "-";
        }
        
        // Output the word so far using dashes
        System.out.println(wordSoFar + "\n");

        /* allow player to make guesses */
        do {
            // Prompt for a letter
            System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
            letterGuess = input.nextLine().toUpperCase();

            // If player did not choose to guess the entire word flag
            if (!letterGuess.equals(FLAG)) {
                /* increment number of guesses */
                numGuesses++;

                /* player correctly guessed a letter--extract string in wordSoFar up to the letter
                 * guessed and then append guessed letter to that string. Next, extract rest of
                 * wordSoFar and append after the guessed letter
                 */
                if (secretWord.indexOf(letterGuess) >= 0) {
                    updatedWord = wordSoFar.substring(0, secretWord.indexOf(letterGuess));
                    updatedWord += letterGuess;
                    updatedWord += wordSoFar.substring(secretWord.indexOf(letterGuess) + 1, wordSoFar.length());
                    wordSoFar = updatedWord;
                }

                /* display guessed letter instead of dash */
                System.out.println(wordSoFar + "\n");
            }

        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));

        /* finish game and display message and number of guesses */
        if (letterGuess.equals(FLAG)) {
            System.out.print("What is your guess? ");
            wordGuess = input.nextLine().toUpperCase();
        }

        if (wordGuess.equals(secretWord) || wordSoFar.equals(secretWord)) {
            System.out.println("You won!");
        } else {
            System.out.println("Sorry. You lose.");
        }

        System.out.println("The secret word is " + secretWord);
        System.out.println("You made " + numGuesses + " guesses.");

        input.close();
    }
}
