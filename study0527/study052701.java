package study0527;

/**
 * class and object:
 * [example] class Person
 *           [variable] name
 *                      age
 *                      country (static)
 *           [function] constructors (two/three param)
 *                      setName() / getName()
 *                      setAge() / getAge()
 *                      show()
 * [example] class PersonDemo (study052701)
 *           to test Person class
 */

public class study052701 {
    public static void main(String args[]) {
        Person ppl = new Person("hhy", 23);
        ppl.show();
        ppl.country = "中国";
        ppl.show();

    }
}

class Person {
    private String name;
    private int age;
    static String country = "CHINA";

    public Person (String pName, int pAge) {
        this.setName(pName);
        this.setAge(pAge);
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

    public void show () {
        System.out.println(this.getName() + " is from " + Person.country + ", " + this.getName() + " is " + this.getAge() + " years old. ");
    }
}
