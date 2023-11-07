package cn.nanchengyu.exer;

/**
 * ClassName: Test
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/7 18:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        Person person = new Person("李白",-100);
//        System.out.println(person);

      try {Person libai = new Person();
          libai.setName("将进酒");
          libai.setLifeValue(-200);
          System.out.println(libai);}
      catch (NoLifeValueException e){
          System.out.println(e.getMessage());
      }
    }





}
