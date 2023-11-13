package cn.nanchnegyu.map;

import java.util.HashMap;
import java.util.Iterator;

/**
 * ClassName: exer1
 * Package: cn.nanchnegyu.map
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/12 2:00
 * @Version 1.0
 */
public class exer1 {
    public static void main(String[] args) {
       HashMap hashMap = new HashMap();
       hashMap.put("张杰","逆战");
        hashMap.put("邓紫棋","喜欢你");
        hashMap.put("群星","逆战");
        hashMap.put("张杰","天下");
        //遍历 方式1
       Iterator iterator = hashMap.keySet().iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
        System.out.println("======");
       Iterator iterator1 = hashMap.keySet().iterator();;
       while (iterator1.hasNext()){
           System.out.println(iterator1.next());
       }
       //遍历方式2：增强for循环
        System.out.println("======");
        for(Object obj: hashMap.entrySet()){
            System.out.println(obj);
        }

    }
}
