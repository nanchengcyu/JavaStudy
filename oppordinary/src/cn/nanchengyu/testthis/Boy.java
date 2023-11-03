package cn.nanchengyu.testthis;

/**
 * ClassName: Biy
 * Package: cn.nanchengyu.testthis
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 16:10
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name ;

    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public Boy() {
    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
     if(age > 22){
         System.out.println("我终于可以结婚了");
     } else {
         System.out.println("我只能谈恋爱了");
     }
    }

}
