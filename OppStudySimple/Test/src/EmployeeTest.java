/**
 * ClassName: EmployeeTe
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 南城余
 * @Create 2023/10/31 23:52
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.id = 10001;
        employee1.age = 24;
        employee1.name = "李新龙";
        employee1.salary = 40000.00;
        employee2.id = 10000;
        employee2.name = "南城余";
        employee2.salary = 80000.00;
        employee2.age = 20;
        System.out.println(employee1.age+employee1.name+ employee1.id+ employee1.salary);
        System.out.println(employee2.age+employee2.name+employee2.id+employee2.salary);

    }


}
