package study0606.login_register_project.lr_pojo;

/**
 * 用户基本描述类
 * [variable] username
 *            password
 * [methods]  constructor
 *            getXxx, setXxx
 *
 */

public class User {
    private String username;
    private String password;

    public User () {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
