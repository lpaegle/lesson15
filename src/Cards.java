import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cards {
    ////////Day 15 - String, practical tasks
    //Task 1 - Write a program where actions with constant values of String (Enums) will be provided.

    // Create a new Enum where all card suits will be stored - Spades, Clubs, Hearts and Diamonds.
    enum Suits {
        Hearts,
        Spades,
        Diamonds,
        Clubs
    }

    //Create a new Enum where all card values will be stored - Two, Three, …, King and Ace.
    enum CardValues{
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }

    public static void main(String[] args) {
        //Using two for loops, create a card pack as the String array with all possible cards, for example, Spades Two, Spades Three, Spades Four, etc. You can use Enum function values() if You want.
        String[] cardDeck = new String[52];     //new array with 52 elements
        int counter = 0;
        for (int i = 0; i < Suits.values().length; i++) {      //.values() - transform enum to array
            for (int j = 0; j < CardValues.values().length; j++) {

                cardDeck[counter] = String.format("%s %s", Suits.values()[i], CardValues.values()[j]);
                //System.out.println(cardDeck[counter]);    //Prints all the cards with suits

                counter++;      //Helps to transform 2D array to 1D array; iterates through all elements

            }
        }
        //Create a shuffle algorithm and shuffle the card pack.

            //Select one random card - last index is 51, it will return 52 elements
            //Math.random()*51;

        //Select the first random card and print it out in the console.
        String randomCard = cardDeck[(int)(Math.random() * 51d)];
        System.out.println("We got a random first card: " + randomCard);

        //*Select another six cards and print all six cards in the console. It is not possible
        // to select the same card from the pack because each card is unique.
        // Please “remove” the card after selection.

        /*  Shuffling algorithm (of 6 elements):
            Takes first element index and swaps with any of 5 remaining;
            Takes second and swaps with any of 4 left ...
         */
        Random rnd = ThreadLocalRandom.current();   //"Random" method
        for (int i = cardDeck.length - 1; i > 0; i--){  //going from top to bottom
            int index = rnd.nextInt(i + 1); // random integer
            String a = cardDeck[index];
            cardDeck[index] = cardDeck[i];
            cardDeck[i] = a;
        }
        //Already shuffled elements will be sequentially printed out first 6 elements
        for (int i = 0; i < 6; i++) {
            System.out.println("We got one of 6 shuffled cards: " + cardDeck[i]);
        }

    }
}
