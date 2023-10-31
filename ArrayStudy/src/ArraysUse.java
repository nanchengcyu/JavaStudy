import java.util.Arrays;


/**
 * ClassName: ArraysUse
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/10/31 21:45
 * @Version 1.0
 */
public class ArraysUse {
    /* 调用Arrays类
     */
//    定义两组数组
    public static void main(String[] args) {
        int[] arr1 = new  int[]{12,23,24,9};
        int[] arr2 = new  int[]{12,23,24,9};
//  调用Arrays中的equals方法
        boolean isEquals = Arrays.equals(arr1,arr2);

        System.out.println(isEquals);
//    调用toString方法，打印数组元素
        System.out.println(Arrays.toString(arr1));
    }

}
