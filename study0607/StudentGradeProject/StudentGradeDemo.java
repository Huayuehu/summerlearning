package study0607.StudentGradeProject;

import study0605.Student;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 *
 * 分析：
 * 		A:定义一个学生类，里面有成员变量：姓名,语文成绩,数学成绩,英语成绩
 * 		B:因为我们最终要按照总分进行排序，说明我们要排序，所以，选择TreeSet集合
 * 		C:两种方式实现，我们选择一种，用比较器实现
 * 		D:键盘录入学生，存储到TreeSet集合
 * 		E:遍历集合
 */

public class StudentGradeDemo {
    public static void main(String args[]) {
        TreeSet<StudentGrade> ts = new TreeSet<StudentGrade>(new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade o1, StudentGrade o2) {
                int num = o1.sum() - o2.sum();
                int num2 = (num == 0) ? o1.getChinese() - o2.getChinese() : num;
                int num3 = (num2 == 0) ? o1.getMath() - o2.getMath() : num2;
                int num4 = (num3 == 0) ? o1.getEnglish() - o2.getEnglish() : num3;
                return num4;
            }
        });
        System.out.println("Student Information Input");
        Scanner in = new Scanner(System.in);
        int time = 3;

        while (time > 0) {
            System.out.println("Please enter Student's name: ");
            String name = in.nextLine();
            System.out.println("Please enter student's chinese grade: ");
            int c = Integer.parseInt(in.nextLine());
            System.out.println("Please enter student's math grade: ");
            int m = Integer.parseInt(in.nextLine());
            System.out.println("Please enter student's english grade: ");
            int e = Integer.parseInt(in.nextLine());

            StudentGrade sg = new StudentGrade(name, c, m, e);
            ts.add(sg);

            time--;
        }

        for (StudentGrade sgs : ts) {
            System.out.println(sgs);
        }

    }

}
