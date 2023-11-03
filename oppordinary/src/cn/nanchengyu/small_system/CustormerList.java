package cn.nanchengyu.small_system;

/**
 * ClassName: CustormerList
 * Package: cn.nanchengyu.small_system
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/3 17:24
 * @Version 1.0
 */
public class CustormerList {

    private Customer[] customers;
    private int total;
    public CustormerList(int totalCustomer) {
      customers= new Customer[totalCustomer];
    }



}
