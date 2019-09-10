package study0604pa2;

import java.util.ArrayList;
import java.util.Random;

/*
  class SolitaireBoard
  The board for Bulgarian Solitaire.  You can change what the total number of cards is for the game
  by changing NUM_FINAL_PILES, below.  Don't change CARD_TOTAL directly, because there are only some values
  for CARD_TOTAL that result in a game that terminates.
  (See comments below next to named constant declarations for more details on this.)
*/


public class SolitaireBoard {

    public static final int NUM_FINAL_PILES = 9;
    // number of piles in a final configuration
    // (note: if NUM_FINAL_PILES is 9, then CARD_TOTAL below will be 45)

    public static final int CARD_TOTAL = NUM_FINAL_PILES * (NUM_FINAL_PILES + 1) / 2;
    // bulgarian solitaire only terminates if CARD_TOTAL is a triangular number.
    // see: http://en.wikipedia.org/wiki/Bulgarian_solitaire for more details
    // the above formula is the closed form for 1 + 2 + 3 + . . . + NUM_FINAL_PILES

    // Note to students: you may not use an ArrayList -- see assgt description for details.


    /**
     Representation invariant:

     <put rep. invar. comment here>
     cardPiles: record the number of card in each card pile

     */

    // <add instance variables here>
    private Random r = new Random();
    private ArrayList<Integer> cardPiles = new ArrayList<>();
    private static int round = 1;

    /**
     Creates a solitaire board with the configuration specified in piles.
     piles has the number of cards in the first pile, then the number of cards in the second pile, etc.
     PRE: piles contains a sequence of positive numbers that sum to SolitaireBoard.CARD_TOTAL
     */
    public SolitaireBoard(ArrayList<Integer> piles) {
        cardPiles = piles;
        assert isValidSolitaireBoard();   // sample assert statement (you will be adding more of these calls)
        System.out.println("Initial configuration: " + configString());
    }


    /**
     Creates a solitaire board with a random initial configuration.
     */
    public SolitaireBoard() {
        int cardTotal = CARD_TOTAL;

        while (cardTotal > 0) {
            int pileCard = r.nextInt(cardTotal + 1);
            cardPiles.add(pileCard);
            cardTotal -= pileCard;
        }

    }


    /**
     Plays one round of Bulgarian solitaire.  Updates the configuration according to the rules
     of Bulgarian solitaire: Takes one card from each pile, and puts them all together in a new pile.
     The old piles that are left will be in the same relative order as before,
     and the new pile will be at the end.
     */
    public void playRound() {
        int newPile = 0;

        for (int i = 0; i < cardPiles.size(); i++) {
            int oldPile = cardPiles.get(i);
            if (oldPile > 0) {
                oldPile -= 1;
                cardPiles.set(i, oldPile);
                newPile++;
            }
        }
        cardPiles.add(newPile);
        System.out.println("[Round " + round + "] Current Configuration: " + configString());
        round++;
    }

    /**
     Returns true iff the current board is at the end of the game.  That is, there are NUM_FINAL_PILES
     piles that are of sizes 1, 2, 3, . . . , NUM_FINAL_PILES, in any order.
     */

    public boolean isDone() {
        if (cardPiles.contains(1)) {
            if (cardPiles.contains(2)) {
                if (cardPiles.contains(3)) {
                    if (cardPiles.contains(4)) {
                        if (cardPiles.contains(5)) {
                            if (cardPiles.contains(6)) {
                                if (cardPiles.contains(7)) {
                                    if (cardPiles.contains(8)) {
                                        if (cardPiles.contains(9)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


    /**
     Returns current board configuration as a string with the format of
     a space-separated list of numbers with no leading or trailing spaces.
     The numbers represent the number of cards in each non-empty pile.
     */
    public String configString() {
        String currResult = "";
        for (int i : cardPiles) {
            if (i > 0) {
                currResult = currResult + " " + i ;
            }
        }
        return currResult;
    }


    /**
     Returns true iff the solitaire board data is in a valid state
     (See representation invariant comment for more details.)
     */
    private boolean isValidSolitaireBoard() {
        // total == CARD_TOTAL && numPiles == NUM_FINAL_PILES
        int numPiles = 0;
        int total = 0;
        for (int i : cardPiles) {
            if (i > 0 ) {
                total += i;
                numPiles++;
            }
        }
        if (total == CARD_TOTAL && numPiles == NUM_FINAL_PILES) {
            return true;
        }
        return false;

    }


    // <add any additional private methods here>


}
