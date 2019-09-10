package study0531;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();//extends Object
    }

    public Student (String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", age = " + age + "] ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Student objStu = (Student) obj;
        if (age != objStu.age) {
            return false;
        }

        if (name == null) {
            return objStu.name == null;
        } else if (name.equals(objStu.name)) {
            return true;
        }
        return true;
    }
}
