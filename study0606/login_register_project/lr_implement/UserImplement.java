package study0606.login_register_project.lr_implement;

import study0606.login_register_project.lr_interface.UserInterface;
import study0606.login_register_project.lr_pojo.User;

import java.util.ArrayList;

public class UserImplement implements UserInterface {
    //为了让多个对象共享同一个成员变量，使用static
    private static ArrayList<User> arr = new ArrayList<User>();

    public UserImplement () {}

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;

        for (User u: arr) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void register(User user) {
        arr.add(user);

    }
}
