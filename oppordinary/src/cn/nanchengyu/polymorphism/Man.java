package cn.nanchengyu.polymorphism;

import java.util.Objects;

/**
 * ClassName: Man
 * Package: cn.nanchengyu.polymorphism
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/4 20:09
 * @Version 1.0
 */
public class Man extends Person{


    int age;
    public void eat(){
        System.out.println("吃多点，才能做一个强壮的龙蛋");
    }
    public void toilet(){
        System.out.println("上厕所，方便下男");
    }
    public void smoke(){
        System.out.println("男人抽烟，其实女人也抽，害");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Man man = (Man) o;
        return age == man.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
