/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/1 13:06
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public  void  study(){
        System.out.println("studying");

    }

    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age +=  addAge;

    }

}
