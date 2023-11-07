package cn.nanchengyu.exer;

/**
 * ClassName: Person
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/7 17:59
 * @Version 1.0
 */
public class Person {
   private String name;
   private int lifeValue;
   public Person(){}
    public Person(String name,int lifeValue){
//    this.name = name;
    setName(name);
    setLifeValue(lifeValue);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0){
        throw new NoLifeValueException("角色："+name+";"+"生命值不能为负数："+lifeValue);
        }
        this.lifeValue = lifeValue;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
