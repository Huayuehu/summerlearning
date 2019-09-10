package study0604pa2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <add main program comment here>
 */

public class BulgarianSolitaireSimulator {

    public static void main(String[] args) {

        boolean singleStep = false;
        boolean userConfig = false;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-u")) {
                userConfig = true;
            } else if (args[i].equals("-s")) {
                singleStep = true;
            }
        }

        // <add code here>
        SolitaireBoard sb = new SolitaireBoard();
        int CARD_TOTAL = sb.CARD_TOTAL;
        Scanner in = new Scanner(System.in);

        if (userConfig) {

            System.out.println("Number of total cards is " + CARD_TOTAL);
            System.out.println("You will be entering the initial configuration of the cards (i.e., how many in each pile): ");
            ArrayList<Integer> arr = new ArrayList<Integer>();

            while (in.hasNextInt()) {
                arr.add(in.nextInt());

                try {
                    System.in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            sb = new SolitaireBoard(arr);

        }


        if (singleStep) {
            do {
                sb.playRound();

                if (sb.isDone()) {
                    System.out.println("Done!");
                    System.exit(0);
                }
                System.out.print("<Type return to continue>");
            } while (in.nextLine().equals(""));

        } else {
            while (!sb.isDone()) {
                sb.playRound();
            }
            System.out.println("Done!");
        }


    }

    // <add private static methods here>


}
