package cn.nanchnegyu.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName: TreeSetExer
 * Package: cn.nanchnegyu.set
 * Description:
 *              获取10个1到20的随机数，要求随机数不能重复，控制台输出遍历
 * @Author 南城余
 * @Create 2023/11/12 0:28
 * @Version 1.0
 */

//思路：因为不能重复，所以可以考虑Set的HashSet子类，因为要控制台输出遍历，所以可以考虑集合遍历的三种方法，Iterator迭代器以及增强For循环的方法
public class TreeSetExer {
    public static void main(String[] args) {
   HashSet hashSet =  new HashSet(10);


   while (hashSet.size() < 10){
       int randomNumber = (int)(Math.random()*(20 - 1 + 1) + 1);
       hashSet.add(randomNumber);
   }
//        for (int i = 0; i <= hashSet.size() ; i++) {
//            int randomNumber = (int)(Math.random()*(20 - 1 + 1) + 1);
//            hashSet.add(randomNumber);
//
//        }
     Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

}
