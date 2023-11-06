package cn.nanchengyu.static_;

/**
 * ClassName: AccoutTest
 * Package: cn.nanchengyu.static_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 0:32
 * @Version 1.0
 */
public class AccoutTest {
    public static void main(String[] args) {

        Accout a1 = new Accout();
        Accout a2 = new Accout();
        Accout a3 = new Accout();
        Accout a4 = new Accout("131413",10000);
        System.out.println(a1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        Accout.setInterestRate(0.0011333);
        //利率和最小额度调用
        System.out.println(Accout.getInterestRate());
        System.out.println(Accout.getBooleanMin());
        //一般toString为重写的话对象后面使用，重写后不在需要
//        System.out.println(a1.toString());
//        System.out.println(a2.toString());
//        System.out.println(a3.toString());
//        System.out.println(a4.toString());
    }
}
