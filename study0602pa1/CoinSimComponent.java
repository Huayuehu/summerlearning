package study0602pa1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws three bars with color: 用paintComponent()就能画出三个bars
 */
public class CoinSimComponent extends JComponent {
    private int MAX_HEIGHT = 420;
    private int BOTTOM_SPACE = 50;
    private int WIDTH = 50;

    private CoinTossSimulator cts;
    private int numTrials;
    private int twoHeads;
    private int twoTails;
    private int headTails;

    private int bottom;
    private int spaceWidth;
    private int left1;
    private int left2;
    private int left3;
    private double scale;
    private String label1;
    private String label2;
    private String label3;

    public CoinSimComponent(int numTrials) {
        cts = new CoinTossSimulator();
        cts.run(numTrials);//running to generate result of trials
        this.numTrials = cts.getNumTrials();
        this.twoHeads = cts.getTwoHeads();
        this.twoTails = cts.getTwoTails();
        this.headTails = cts.getHeadTails();

    }

    @Override //paintComponent()是swing的一个方法，相当于图形版的main()，会自动执行，顺序一般是先执行构造函数再执行这个方法
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //all params needed by Bar(...)
        bottom = getHeight() - BOTTOM_SPACE;
        spaceWidth = (getWidth() - (3*WIDTH)) / 4;
        left1 = spaceWidth;
        left2 = left1 + spaceWidth + WIDTH;
        left3 = left2 + spaceWidth + WIDTH;
        scale = (double) MAX_HEIGHT / numTrials;
        label1 = "Two Heads: " + twoHeads + " (" + Math.round((twoHeads*1.0/numTrials)*100.0) + "%)";
        label2 = "A Head and a Tail: " + headTails + " (" + Math.round((headTails*1.0/numTrials)*100.0) + "%)";
        label3 = "Two Tails: " + twoTails + " (" + Math.round((twoTails*1.0/numTrials)*100.0) + "%)";

        Bar bar1 = new Bar(bottom, left1, WIDTH, twoHeads, scale, Color.red, label1);
        Bar bar2 = new Bar(bottom, left2, WIDTH, headTails, scale, Color.green, label2);
        Bar bar3 = new Bar(bottom, left3, WIDTH, twoTails, scale, Color.blue, label3);

        bar1.draw(g2);
        bar2.draw(g2);
        bar3.draw(g2);
    }
}
