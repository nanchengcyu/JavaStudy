package cn.nanchengyu.extend.test;

/**
 * ClassName: Cylinder
 * Package: cn.nanchengyu.extend.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 23:50
 * @Version 1.0
 */
public class Cylinder extends  Circle{
    private double length;

    public Cylinder() {
      this.length = 1;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double findVolume(){
        //return findArea()*length;
       // return 3.14*getRadius()*getRadius()*getLength();
        return super.getRadius()*getLength();
    }
    public double findArea(){
        //return findArea()+2*3.14*getRadius()*getLength();
        return  super.findArea()*2+2*3.14*getRadius()*getLength();
    }
}
