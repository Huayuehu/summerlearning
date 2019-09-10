package study0610;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
        super();//extends Object
    }

    public Student(String name, int age) {
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

/*    @Override
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
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 15;
        int num1 = prime * name.hashCode() + age;
        return num1;
    }*/

    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;
        int num2 = num == 0 ? this.name.compareTo(o.name) : num ;
        return num2;
    }
}
