package cn.nanchengyu.interface_;

/**
 * ClassName: EatableTest
 * Package: cn.nanchengyu.interface_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 18:00
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {

        Eatable[] eatables = new  Eatable[3];

   //创建对象输出
    eatables[0] = new Chinese();
    eatables[1] = new American();
    eatables[2] = new Indian();

        for (int i = 0; i < eatables.length ; i++) {
            eatables[i].eat();
            System.out.println();
        }

        System.out.println();
        eatables[0].eat();
        eatables[1].eat();
        eatables[2].eat();
 //



    }
}
