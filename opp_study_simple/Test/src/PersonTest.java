/**
 * ClassName: PersonTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/1 13:13
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "longdan";
        p1.age = 12;
        p1.study();
        p1.showAge();
        p1.addAge(2);
        System.out.println(p1.name+"/t"+p1.age);

    }



}
