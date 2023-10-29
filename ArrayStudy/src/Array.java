/**
 * ClassName: Array
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/10/29 20:33
 * @Version 1.0
 */
public class Array {
    public static void main(String[] args) {
        // 一维数组
//      动态数组  定义，初始化
        int[] prices = new int[5];
//        静态数组
//      int[] prices = new int[] {1,2,3}
//        调用
        prices[0] = 1;
        prices[1] = 1;
        prices[2] = 8;
        prices[3] = 10;
        prices[4] = 5;
//        遍历数组
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println();

//        二维数组
//        定义和初始化
//        动态数组
        int[][] arr = new  int[3][4];
//        静态数组
//       int[][] arr = new  int[][]{{1,2,3},{2,3},{9,8}};
//       调用
//       打印数组长度
        arr[1][2]=1;
        System.out.println(arr[0]);//打印其地址
        System.out.println(arr[1][2]);

        int[][] arr1 = new int[][]{{1,2},{2,3},{9,8}};
// 遍历数组
        int i,j;
        for(i = 0; i < arr1.length; i++ ){
            for (j = 0; j < arr1[i].length; j++ ){
                System.out.println(arr1[i][j]+"\t");
            }
            System.out.println(); // 在每行的结束添加一个新行，使得输出更清晰
        }

    }
}
