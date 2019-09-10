package study0606.login_register_project.lr_test;

import study0606.login_register_project.lr_implement.UserImplement;
import study0606.login_register_project.lr_interface.UserInterface;
import study0606.login_register_project.lr_pojo.User;

/**
 * 注意： 多个对象共享同一个成员变量时，该变量用static
 */


import java.util.Scanner;

public class UserTest {
    public static void main(String args[]) {
        UserInterface ui = new UserImplement();

        //起始界面

        while (true) {
            System.out.println();
            System.out.println("--------------WELCOME--------------");
            System.out.println("1 LOGIN");
            System.out.println("2 REGISTER");
            System.out.println("3 EXIT");
            System.out.println();
            System.out.println("Please enter your choice (1/2/3): ");

            Scanner in = new Scanner(System.in);
            String choice = in.nextLine();
            if (choice.equals("1")) {
                System.out.println("--------------LOG IN--------------");
                System.out.println("Please enter your username: ");
                String userName = in.nextLine();
                System.out.println("Please enter your password: ");
                String passWord = in.nextLine();

                boolean flag = ui.isLogin(userName, passWord);
                if (flag) {
                    System.out.println("Successful log in!");
                    System.exit(0);
                } else {
                    System.out.println("ERROR in username or password!");
                }

            }
            else if (choice.equals("2")) {
                System.out.println();
                System.out.println("--------------REGISTER--------------");
                System.out.println("Please enter your username: ");
                String userName = in.nextLine();
                System.out.println("Please enter your password: ");
                String passWord = in.nextLine();

                //将userName和passWord封装进一个User对象
                User user = new User();
                user.setUsername(userName);
                user.setPassword(passWord);

                //调用注册这个功能
                ui.register(user);

                System.out.println("Successful registration!");

            }
            //选择3退出或者输入其他字符都跟它88
            else if (choice.equals("3")){
                System.out.println();
                System.out.println("---Until I see U again, wish u a fond farewell!---");
                System.exit(0);
            } else {
                System.out.println();
                System.out.println("Wrong number. ");
            }
        }
    }
}
