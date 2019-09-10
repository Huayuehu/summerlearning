package study0606;

public class Tool2Test {
    public static void main(String args[]) {
        Student s = new Student();
        //Teacher t = new Teacher();

/*        Tool2<Student> tool = new Tool2<Student>();
        tool.setQq(s);
        Student ss = tool.getQq();
        ss.love();

        Tool2<Teacher> tool2 = new Tool2<Teacher>();
        tool2.setQq(t);
        Teacher tt = tool2.getQq();
        tt.love();*/

        Tool tool = new Tool();
        tool.setObj(s);
        Student ss = (Student) tool.getObj();
 /*       ss.love();

        tool.setObj(t);
        Teacher tt = (Teacher) tool.getObj();
        tt.love();
*/
        //Student sss = (Student) tool.getObj();
        //sss.love();
    }

}
