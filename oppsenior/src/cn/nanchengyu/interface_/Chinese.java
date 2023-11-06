package cn.nanchengyu.interface_;

/**
 * ClassName: Chinese
 * Package: cn.nanchengyu.interface_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 17:52
 * @Version 1.0
 */
public  class Chinese implements  Eatable{
    @Override
    public void eat() {
        System.out.println("中国人用筷子吃饭");
    }
}
