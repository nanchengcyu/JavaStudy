package cn.nanchengyu.exer;

import java.util.Arrays;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/12 20:54
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
     String[] arr = new String[]{"a","b","c"};
     method(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }

    public static <E> void method(E[] e,int a,int b){
        E tmp = e[a];
        e[a] = e[b];
        e[b] = tmp;
    }
}
