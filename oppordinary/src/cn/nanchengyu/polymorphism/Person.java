package cn.nanchengyu.polymorphism;

/**
 * ClassName: Person
 * Package: cn.nanchengyu.polymorphism
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/4 20:09
 * @Version 1.0
 */
public class Person {

    public void eat(){
        System.out.println("吃饭咯");
    }
    public void toilet(){
        System.out.println("上厕所");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
