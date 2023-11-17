package cn.nanchengyu.jdbcstudy;

import java.sql.*;

/**
 * ClassName: Jdbc
 * Package: cn.nanchengyu.jdbcstudy
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/16 17:45
 * @Version 1.0
 */
public class Jdbc {
    /*1. 注册驱动
        2. 获取连接
        3. 创建发送sql语句，并获取返回结果
        4. 结果集解析
        5. 资源关闭*/
    public static void main(String[] args) throws SQLException {


//        1. 注册驱动
//        DriverManager.registerDriver(new Driver());
//        2. 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atguigu", "root", "zhu1280829980..");
//        3. 创建发送sql语句，并获取返回结果
        Statement statement = connection.createStatement();
        String sql = "select employee_id,first_name from employees;";
//        4. 结果集解析
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String employeeId = resultSet.getString("employee_id");
            String firstName = resultSet.getString("first_name");
            System.out.println("员工ID:\t"+employeeId+"员工姓名:"+firstName);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
