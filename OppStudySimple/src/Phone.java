/**
 * ClassName: Phone
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/10/31 22:44
 * @Version 1.0
 */
public class Phone {

    //属性,就是一类事物的标志
    String name;
    int price;
    //方法，一类事物的动作
    public void call(){
        System.out.println("这款手机可以拨打电话");
    }
    public void listenMusic(){
        System.out.println("这款手机可以听音乐");
    }
    public void sendMessage(String message){
        System.out.println("你发送的内容为"+message);
    }
}
