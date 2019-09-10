package study0526;

/**
 * the most simply class and method
 */
public class study050602 {
    public static void main(String args[]) {
        Test test1 = new Test();
        test1.show();
        System.out.println("-------------------------------------");
        test1.showwithargs("Huayue Hua");
    }
}
    /*
    Test is a class
    hhy, hebe, she are variables of this class
    show, showwithargs are methods of this class
     */
    class Test {
        int hhy = 1110;
        int hebe = 330;
        int she = 911;

        void show () {
            System.out.println("Below are from 'show' method: ");
            System.out.println("HHY's bday: " + hhy);
            System.out.println("hebe's bday: " + hebe);
            System.out.println("S.H.E's bday: " + she);
        }


        void showwithargs (String name) {
            System.out.println("Below are from 'showwithargs' method: ");
            System.out.println("The name you are looking for is: " + name);
        }


}
