package study0602pa1;

import javax.swing.JFrame;

public class CarViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        CarComponent component = new CarComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}


