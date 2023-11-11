package cn.nanchengyu.exer;

/**
 * ClassName: person
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/10 10:55
 * @Version 1.0
 */
public class Person {
    private String username;
    private String password;

    public Person() {
    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
