package study0607;

import java.util.Objects;

/**
 * 如果我们想对象进行自然排序，我们就应该让对象所属的类实现自然排序接口Comparable
 */


public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 15;
    }

    @Override
    public int compareTo(Object o) {
        // 做这种题目的难点是自己要明确比较的次要条件
        // 主要条件：按照年龄比较
        // 次要条件：当年龄相同，比较姓名，这是要自己能够分析出来的
        Person p = (Person) o;
        int num = this.age - p.age;

        int num2 = (num == 0) ? this.name.compareTo(p.name) :  num;

        return num2;
    }
}
