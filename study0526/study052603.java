package study0526;

/**
 * Iphone class introduces some basic functions of iphone
 */
public class study052603 {
    public static void main(String args[]) {
        Iphone iphoneX = new Iphone();
        iphoneX.model = "iPhone X";
        iphoneX.storage = 64;
        iphoneX.text();
        System.out.println("-------------------------------");
        iphoneX.dial();
        System.out.println("-------------------------------");
        iphoneX.show(iphoneX.model, iphoneX.storage);
        System.out.println("-------------------------------");

    }
}

    /*
    Iphone class introduces some basic function of iphone:
    @variable:
        model
        storage
    @function:
        text
        dial
        show
     */
    class Iphone {
        String model;
        int storage;

        void text () {
            System.out.println( this.model + " can be used to text. ");
        }

        void dial () {
            System.out.println( this.model + " can be used to dial. ");
        }

        void show (String modelname, int modelstorage) {
            System.out.println("Brief introductions about this phone: ");
            System.out.println("-"  + modelname + " have a storage of " + modelstorage +"G.");
            System.out.print("-");
            this.text();
            System.out.print("-");
            this.dial();
        }


    }