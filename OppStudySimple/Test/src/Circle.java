import static java.lang.Math.PI;

/**
 * ClassName: Circle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/1 21:19
 * @Version 1.0
 */
public class Circle {
    public static void main(String[] args) {

    Circle circle = new Circle();


        circle.area(2);

        System.out.println(circle.area1(2));
    }
//   无返回值
    public  void area(double r){

        double area = PI*r*r;

        System.out.println(area);
    }
//    有返回值
    public double area1(double r1){

        return  (PI*r1*r1);
    }

}
