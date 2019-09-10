package study0527;

/**
 * constructor in extends relationship
 * 1. All constructors of son's will access to father's default constructor:
 *      a. for son class will use members from father, so father's member variables must be initiated.
 *      b. the first sentence in every son's constructor is "super();" (default)
 * 2. How to access to father's constructors with param?
 *      using "super(param1, param2, ...)"
 * 3. class Father:
 *      a. constructor one: Father ();
 *      b. constructor two: Father (String name);
 *    class Son extends Father:
 *      a. constructor one: Son ();
 *      b. constructor two: Son (String name);
 *    class Study062704(ExtendsDemo)
 */

public class Study052704 {
    public static void main(String args[]) {
        Son1 s1 = new Son1();
        System.out.println("------------------------------------");
        Son1 s2 = new Son1("hhhhhuahhhhh");
    }
}

class Father1 {
    public Father1 () {
        System.out.println("This is Father constructor without param. ");
    }

    public Father1 (String name) {
        System.out.println("Hello, " + name + "! This is Father constructor with param. ");
    }
}

class Son1 extends Father1 {
    public Son1 () {
        //super();
        //to see if sentence will be printed out
        System.out.println("Son's constructor without param. ");
    }

    public Son1 (String name) {
        //super();
        //super("hhy");
        System.out.println("Son's constructor with param: " + name + ". ");
    }
}