package study0606.login_register_project.lr_interface;

import study0606.login_register_project.lr_pojo.User;

public interface UserInterface {
    public abstract boolean isLogin (String username, String password);
    public abstract void register (User user);

}
