package cn.nanchengyu.innerclass;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.innerclass
 * Description:  接口和抽象类调用，可以使用匿名类方法
 *
 * @Author 南城余
 * @Create 2023/11/5 21:01
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.method();

//匿名对象调用接口A 方法1
        A a =  new A(){
            public  void method(){
                System.out.println("override A's method");
            }
        };
        a.method();

//   匿名对象调用接口A 方法2
        new A(){
            public  void method(){
                System.out.println("override A's method");
            }
        }.method();
    }  // 这是匿名类实现的 A 接口的方法




}

            interface A{
                        public  void method();
            }

        class B implements A{
            public  void method(){
                System.out.println("override A's method");
            }
        }