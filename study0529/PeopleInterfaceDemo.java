package study0529;

/**
 * Adult class (son) ~ People class (father)
 * Drinking interface
 *
 */

public class PeopleInterfaceDemo {
    public static void main(String args[]) {
        Adult a = new Adult();
        a.setName("hhy");
        a.setAge(23);
        System.out.println("Adult has a name of " + a.getName() + ", and age is " + a.getAge() + ". ");
        a.study();
        a.drink();
        a.sleep();
    }
}

interface Drinking {
    public abstract void drink ();
}

abstract class People {
    private String name;
    private int age;

    public People () {}

    public People (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void sleep () {
        System.out.println("People need sleep. ");
    }

    public abstract void study ();
}

class Adult extends People implements Drinking {
    public Adult () {}

    public Adult (String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("Adult also need study. ");
    }

    @Override
    public void drink() {
        System.out.println("Adult can drink alcohol lol!!!!");
    }
}


