package cn.nanchengyu.junit_;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JunitTest
 * Package: cn.nanchengyu.junit_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/6 11:51
 * @Version 1.0
 */
public class JunitTest {

    @Test
    public void test(){
        System.out.println("hello world");
    }

      @Test
      public void test1() {
          System.out.println("请输入一个值");
          Scanner scanner = new Scanner(System.in);

          if (scanner.hasNextInt()) {
              int a = scanner.nextInt();
              System.out.println(a);
          } else {
              System.out.println("输入的不是整数");
          }

          scanner.close();
      }


      @Test
      public void test2(){
          double a = 1000.0;
          int b = 1000;
          Integer c = b;
//          System.out.println(a == b);
          System.out.println(c);
      }

}
