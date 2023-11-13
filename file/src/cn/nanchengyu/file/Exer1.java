package cn.nanchengyu.file;

import java.io.File;

/**
 * ClassName: exer1
 * Package: cn.nanchengyu.file
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/13 15:51
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {

        File file1 = new File("abc.txt");
        File file2  = new File(file1.getAbsoluteFile().getParent(),"hello.txt");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file2.getAbsoluteFile());
    }

}
