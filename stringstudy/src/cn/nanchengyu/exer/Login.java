package cn.nanchengyu.exer;

import java.util.Scanner;

/**
 * ClassName: Login
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/10 10:57
 * @Version 1.0
 */
public class Login {
    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Person("lxl", "lxl");


        System.out.println("=========LoginCenter=============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：" );
        String username = scanner.next();
        System.out.println( username);
        System.out.println("请输入密码：" );
        String password = scanner.next();

        System.out.println(password);



        for (int i = 0; i < person.length; i++) {
            if (person[i].getUsername().equals(username) && person[i].getPassword().equals(password)) {
                System.out.println("登录成功"+username);
                break;
            }
            else {
                System.out.println("用户名或密码有误");
            }

            scanner.close();

        }

    }
}
