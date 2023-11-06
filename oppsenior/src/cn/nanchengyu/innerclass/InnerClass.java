package cn.nanchengyu.innerclass;

/**
 * ClassName: InnerClass
 * Package: cn.nanchengyu.innerclass
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 20:50
 * @Version 1.0
 */
public class InnerClass {
    public static void main(String[] args) {

//    Object object =new Object(); 下面类似于此

        new Object() {
            public void test() {

                System.out.println("CC,I love you");
            }

        }.test();

    }
}

//class Test {
//    public void test(){
//
//        System.out.println("CC,I love you");
//    }
//}