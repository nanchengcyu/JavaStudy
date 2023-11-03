package cn.nanchengyu.testthis;

/**
 * ClassName: Girl
 * Package: cn.nanchengyu.testthis
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 16:17
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name ;

    }
    public String getName(){
        return name;
    }

     public void marry(Boy boy){
         System.out.println("我想和"+boy.getName()+"谈恋爱");
     }

     public void  compare(Girl girl){

     }
   public  Girl(){

   }
    public Girl(int age) {
        this.age = age;
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
