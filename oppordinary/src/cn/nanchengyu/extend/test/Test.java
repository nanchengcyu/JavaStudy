package cn.nanchengyu.extend.test;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.extend.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 23:57
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Cylinder cc =new Cylinder();
        cc.setLength(10.0);
        cc.setRadius(2.0);


        System.out.println(cc.findArea());
        System.out.println(cc.findVolume());
    }


}
