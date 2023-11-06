package cn.nanchengyu.polymorphism;

/**
 * ClassName: Woman
 * Package: cn.nanchengyu.polymorphism
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/4 20:09
 * @Version 1.0
 */
public class Woman extends Person{
    public void eat(){
        System.out.println("吃饭咯,少吃点，变漂亮");
    }
    public void toilet(){
        System.out.println("上厕所，女");
    }
     public void makeup(){
         System.out.println("化妆，变漂亮，做一个精致的女人，更瘦更年轻");
     }
}
