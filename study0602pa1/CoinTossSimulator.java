package study0602pa1;


import java.util.Random;

/**
 * class CoinTossSimulator: 可以得到试验之后三种情况分布的数据
 *
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 *
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants,
 * and private methods to the class.  You will also be completing the
 * implementation of the methods given.
 *
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 *
 */
public class CoinTossSimulator {
    private int numTrials;
    private int twoHeads;
    private int twoTails;
    private int headTails;
    private Random r = new Random();

    /**
     Creates a coin toss simulator with no trials done yet.
     */
    public CoinTossSimulator() {

    }

    /**
     Runs the simulation for numTrials more trials. Multiple calls to this method
     without a reset() between them *add* these trials to the current simulation.

     @param numTrials  number of trials to for simulation; must be >= 1
     */
    public void run(int numTrials) {
        this.numTrials = numTrials;

        /**
         * get result of heads and tails using random()
         * 0---tail, 1---head
         * 不能用直接用numTrials--来做，如果这样，退出循环的时候numTrials=0，getNumTrial()也是返回0
         */
        for (int i = numTrials; i > 0; i--) {
            int result1 = r.nextInt(2);
            int result2 = r.nextInt(2);

            if (result1 + result2 == 0) {
                twoTails++;
            }

            if (result1 + result2 == 1) {
                headTails++;
            }

            if (result1 + result2 == 2) {
                twoHeads++;
            }
        }
    }


    /**
     Get number of trials performed since last reset.
     */
    public int getNumTrials() {
        return numTrials;
    }


    /**
     Get number of trials that came up two heads since last reset.
     */
    public int getTwoHeads() {
        return twoHeads;
    }


    /**
     Get number of trials that came up two tails since last reset.
     */
    public int getTwoTails() {
        return twoTails;
    }


    /**
     Get number of trials that came up one head and one tail since last reset.
     */
    public int getHeadTails() {
        return headTails;
    }


    /**
     Resets the simulation, so that subsequent runs start from 0 trials done.
     */
    public void reset() {
        numTrials = 0;
        twoHeads = 0;
        twoTails = 0;
        headTails = 0;
    }

}

