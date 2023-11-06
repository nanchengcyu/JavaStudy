package cn.nanchengyu.polymorphism;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.polymorphism
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/4 20:14
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

      Test test = new Test();
      test.meeting(new Person(),new Man(),new Woman());
//        System.out.println(new Person().toString());
//        new Man();
//        new Woman();
    }

    public  static void meeting(Person ... ps){

        for (int i = 0; i < ps.length ; i++) {

            ps[i].eat();
            ps[i].toilet();

            if(ps[i] instanceof Man){
               Man man = (Man)ps[i];
                man.smoke();
            }
             if(ps[i] instanceof Woman){
                 //System.out.println(((Woman) ps[i]).makeup(););
                 Woman woman = (Woman) ps[i];
                 woman.makeup();
             }
            System.out.println();
        }
    }
}
