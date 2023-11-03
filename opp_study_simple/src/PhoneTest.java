/**
 * ClassName: PhoneTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/10/31 22:50
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "IPHONE16PROMAX";
        phone.price = 9999;
//    调用类的属性
        System.out.println("这款手机的名字是"+phone.name+"这款手机的价格是$"+phone.price);
//     调用类的方法
        phone.call();
        phone.listenMusic();
        phone.sendMessage("我爱你啊，龙蛋，哈哈哈哈哈");
    }


}
