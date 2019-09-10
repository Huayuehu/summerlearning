package study0602pa1;


// we included the import statements for you
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 *
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 *
 */
public class Bar {
    private int bottomBar;
    private int leftBar;
    private int widthBar;
    private int barHeightBar;
    //private double scaleBar;
    private Color colorBar;
    private String labelBar;


    /**
     Creates a labeled bar.  You give the height of the bar in application
     units (e.g., population of a particular state), and then a scale for how
     tall to display it on the screen (parameter scale).

     @param bottom  location of the bottom of the label
     @param left  location of the left side of the bar
     @param width  width of the bar (in pixels)
     @param barHeight  height of the bar in application units
     @param scale  how many pixels per application unit
     @param color  the color of the bar
     @param label  the label at the bottom of the bar
     */
    public Bar(int bottom, int left, int width, int barHeight,
               double scale, Color color, String label) {
        bottomBar = bottom;
        leftBar = left;
        widthBar = width;
        barHeightBar = (int) (barHeight * scale);
        colorBar = color;
        labelBar = label;

    }

    /**
     Draw the labeled bar.
     @param g2  the graphics context
     */
    public void draw(Graphics2D g2) {

        Font font = g2.getFont();
        FontRenderContext context = g2.getFontRenderContext();//字体的上下文对象
        Rectangle2D stringBounds = font.getStringBounds(labelBar, context);//返回包围文字的矩形的边界信息

        //get the width and height of the label
        int fontWidth = (int) stringBounds.getWidth();
        int fontHeight = (int) stringBounds.getHeight();
        int barBottom = (int) (bottomBar - fontHeight - barHeightBar);
        int labelLeft = (int) (leftBar + widthBar/2 - fontWidth/2);

        Rectangle bar = new Rectangle(leftBar, barBottom, widthBar, barHeightBar);//左上顶点，宽度，高度

        if (barHeightBar > 0) {
            g2.setColor(colorBar);
            g2.fill(bar);
            g2.draw(bar);
        }

        g2.setColor(Color.black);
        g2.drawString(labelBar, labelLeft, bottomBar);//(x,y)左下标
    }
}
