package cn.nanchengyu.equals;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.equals
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/4 22:09
 * @Version 1.0
 */
public class Test
{
    public static void main(String[] args) {
        Order o1 = new Order(1,"1号桌子");

        Order o2 = new Order(2,"1号桌子");
        System.out.println(o1.equals(o2));
        System.out.println(o1.toString());

    }
}
