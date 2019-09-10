package study0527;

/**
 * Inherent
 * class Father
 *       [variable] num1 (private)
 *                  num2 (public)
 *       [function] show1 (private)
 *                  show2 (public)
 * class Son extends Father
 * class ExtendsDemo (study052703)
 */

public class study052703 {
    public static void main(String args[]) {
        System.out.println("For Son object:");
        Son s = new Son();
        //System.out.println("Son can access num1 in Father: "  + s.num1 + ". ");
        System.out.println("Son can access num2 in Father: "  + s.num2 + ". ");
        //s.show1();
        s.show2();

        System.out.println("----------------------");

        System.out.println("For Father object:");
        Father f = new Father();
        //System.out.println("num1 in Father: "  + f.num1 + ". ");
        System.out.println("num2 in Father: "  + f.num2 + ". ");
        //f.show1();
        f.show2();
    }
}


class Father {
    private int num1 = 330;
    public int num2 = 1110;

    private void show1 () {
        System.out.println("This is private show1 function in Father. ");
    }

    public void show2 () {
        System.out.println("This is public show2 function in Father. ");
    }
}

class Son extends Father {

}

