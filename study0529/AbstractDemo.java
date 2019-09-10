package study0529;

/**
 * Abstract class
 *
 * abstract class Fan:
 * [variable] attribute
 *            age
 *            idolName
 * [methods] constructors
 *           forIdol (abstract method)
 *           eat
 *
 * class sbFan extends Fan:
 *           constructors
 *           overrides forIdol method
 *
 * class trueLoveFan extends Fan:
 *           constructors
 *           overrides forIdol method
 *
 * class AbstractDemo: to test classes above
 *           main(String args[])
 */

public class AbstractDemo {
    public static void main(String args[]) {
        //for sbFan
        System.out.println("Below are information about sb1: ");
        sbFan sb1 = new sbFan();
        sb1.setAttribute("Naocan");
        sb1.setAge(5);
        sb1.setIdolName("every idol");
        sb1.show();
        sb1.eat();
        sb1.forIdol();

        System.out.println("-----------------------------------");

        System.out.println("Below are information about sb2: ");
        sbFan sb2 = new sbFan("duwei", 1, "every idol");
        sb2.show();
        sb2.eat();
        sb2.forIdol();

        System.out.println("-----------------------------------");

        //for trueLoveFan
        System.out.println("Below are information about dl1: ");
        trueLoveFan dl1 = new trueLoveFan();
        dl1.setAttribute("hhy");
        dl1.setAge(23);
        dl1.setIdolName("Hebe Tien");
        dl1.show();
        dl1.eat();
        dl1.forIdol();

        System.out.println("-----------------------------------");

        System.out.println("Below are information about dl2: ");
        trueLoveFan dl2 = new trueLoveFan("sue", 25, "honey Hebe");
        dl2.show();
        dl2.eat();
        dl2.forIdol();
    }
}

abstract class Fan {
    private String attribute;
    private int age;
    private String idolName;

    public Fan () {}

    public Fan (String attribute, int age, String idolName) {
        this.attribute = attribute;
        this.age = age;
        this.idolName = idolName;
    }

    public abstract void forIdol (); //do not have method body

    public void eat () {
        System.out.println("All people need eat. ");
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIdolName(String idolName) {
        this.idolName = idolName;
    }

    public String getIdolName() {
        return idolName;
    }

    public void show () {
        System.out.println(this.getAttribute() + " is " + this.getAge() + " years old, with " + this.getIdolName() + ". ");
    }
}

class sbFan extends Fan {
    public sbFan () {}

    public sbFan (String attribute, int age, String idolName) {
        this.setAttribute(attribute);
        this.setAge(age);
        this.setIdolName(idolName);// = super(attribute, age, idolName);
    }

    @Override
    public void forIdol () {
        System.out.println("SB fans will do crazy stupid things for the name of 'love'. ");
    }
}

class trueLoveFan extends Fan {
    public trueLoveFan () {}

    public trueLoveFan (String attribute, int age, String idolName) {
        super(attribute, age, idolName);
    }

    @Override
    public void forIdol() {
        System.out.println("True love fans can be inspired by the idol they love, will be a better one 2gether 4ever. Keep Moving!!!! ");
    }
}