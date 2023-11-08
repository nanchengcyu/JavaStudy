package cn.nanchengyu.exer1;

import static java.lang.Thread.MAX_PRIORITY;

/**
 * ClassName: Exer1
 * Package: cn.nanchengyu.exer1
 * Description:获取main线程对象的名称和优先级。
 * 声明一个匿名内部类继承Thread类，重写run方法，在run方法中获取线程名称和优先级。设置该线程优先级为最高优先级并启动该线程。
 *
 * @Author 南城余
 * @Create 2023/11/8 15:47
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
    Thread t  =  new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"优先级:"+getPriority());
            }
        };
    t.setPriority(MAX_PRIORITY);
    t.start();


        System.out.println(Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority());
    }
}
