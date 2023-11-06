package cn.nanchengyu.extend.test;



/**
 * ClassName: Circle
 * Package: cn.nanchengyu.extend.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 23:50
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle() {
         this.radius = 1;
    }

    public void setRadius(double radius){

    }

    public double getRadius() {
        return radius;
    }
    public  double findArea(){
        return 3.14*radius*radius;
    }

}
