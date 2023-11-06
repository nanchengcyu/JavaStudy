package cn.nanchengyu.interface_;

/**
 * ClassName: Indian
 * Package: cn.nanchengyu.interface_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 17:59
 * @Version 1.0
 */
public class Indian implements Eatable{
    @Override
    public void eat() {
        System.out.println("印度人用手抓饭");
    }
}
