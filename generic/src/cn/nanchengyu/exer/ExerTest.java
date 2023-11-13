package cn.nanchengyu.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: ExerTest
 * Package: cn.nanchengyu.exer
 * Description:
 * （1）创建一个ArrayList集合对象，并指定泛型为<Integer>
 * <p>
 * （2）添加5个[0,100)以内的整数到集合中
 * <p>
 * （3）使用foreach遍历输出5个整数
 * <p>
 * （4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
 * <p>
 * （5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
 *
 * @Author 南城余
 * @Create 2023/11/12 19:37
 * @Version 1.0
 */
public class ExerTest {
    public static void main(String[] args) {
        //1）创建一个ArrayList集合对象，并指定泛型为<Integer>
        ArrayList<Integer> arrayList = new ArrayList<>();


//    2）添加5个[0,100)以内的整数到集合中
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (100 - 0 + 1));
            arrayList.add(random);
        }
//        （3）使用foreach遍历输出5个整数
        for (Integer value : arrayList) {
            System.out.println(value);
        }
        //（4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>

        arrayList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println("===========");

        //（5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
          Integer value =  iterator.next();
            System.out.println(value);
        }
    }



}
