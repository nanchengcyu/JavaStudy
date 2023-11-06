package cn.nanchengyu.static_;

/**
 * ClassName: Accout
 * Package: cn.nanchengyu.static_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 0:19
 * @Version 1.0
 */
public class Accout {
    private int accoutId;
    private String pwd;
    private double balance;
    private static double interestRate;
    private static double booleanMin = 1.0;

   private static int init = 1000000;

    public Accout() {
        this.accoutId = init;
        init++;
        pwd = "000000";
    }
    public Accout(String pwd, double balance) {
        this.pwd = pwd;
        this.balance = balance;
        this.accoutId = init;
        init++;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Accout.interestRate = interestRate;
    }

    public static double getBooleanMin() {
        return booleanMin;
    }

    public static void setBooleanMin(double booleanMin) {
        Accout.booleanMin = booleanMin;
    }

    @Override
    public String toString() {
        return "Accout{" +
                "accoutId=" + accoutId +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
