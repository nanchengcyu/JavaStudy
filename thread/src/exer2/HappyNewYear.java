package exer2;

/**
 * ClassName: HappyNewYear
 * Package: cn.nanchengyu.exer1.exer2
 * Description:
 * 用java线程同步写一段模拟新年倒计时，每隔一面输出一个数字，10到0，最后输出新年快乐
 *
 * @Author 南城余
 * @Create 2023/11/8 17:15
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {

        TimeOut timeOut = new TimeOut();
        timeOut.start();


    }


}

class TimeOut extends Thread {

    @Override
    public void run() {

        synchronized (TimeOut.class) {

            for (int i = 10; i >= 0; i--) {


                System.out.println(i);


            }
            System.out.println("happy new year!");
        }
    }
}