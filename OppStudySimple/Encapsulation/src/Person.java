/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/2 17:06
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int a){
        if (age >= 0 && age <= 130){
             age = a ;
        } else {
            System.out.println("你的输入非法");
        }


    }
    public int getAge(){
        return age;
//        return age;
    }


}
