package study0602pa1;

import javax.swing.JFrame;
import java.util.Scanner;

/**
 * This class contains main()
 * input
 */
public class CoinSimViewer {
    public static void main(String args[]) {
        //get the # of trials
        Scanner in = new Scanner(System.in);
        int numTrials = 0;

        boolean flag = true;
        while(flag) {
            System.out.println("Please enter number of trials: ");
            numTrials = in.nextInt();
            if (numTrials <= 1) {
                System.out.println("ERROR: The trial number must be greater than 1. ");
                continue;
            }
            JFrame frame = new JFrame();//设置一个框架

            frame.setSize(800, 500);//窗口的大小为800*500像素
            frame.setTitle("CoinSim");//设置窗口名字
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时结束程序
            frame.setLocationRelativeTo(null);//设置窗口在屏幕上居中
            frame.setVisible(true);//设置窗口为可见模式

            CoinSimComponent component = new CoinSimComponent(numTrials);//得到三个bars
            frame.add(component);//将得到的三个bars添加进窗口里

            frame.setVisible(true);//加了component之后需要重新设置可见
            flag = false;
        }

    }
}
