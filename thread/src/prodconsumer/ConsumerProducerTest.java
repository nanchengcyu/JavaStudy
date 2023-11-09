package prodconsumer;

/**
 * ClassName: ConsumerProducerTest
 * Package: prodconsumer
 * Description:
 * 问题描述：
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有固定数量的产品(比如:20），
 * 如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品。
 *问题解析：
 * 1.是否是多线程问题？ 是，生产者，消费者
 * 2.是否有共享数据？ 有！共享数据是产品
 * 3.是否有线程安全问题？ 有！因为有共享数据
 * 4.是否需要处理线程安全问题？ 是！如何处理，使用同步机制
 * 5.是否存在线程间的通信？存在。
 * @Author 南城余
 * @Create 2023/11/9 16:46
 * @Version 1.0
 */
public class ConsumerProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor p1 = new Productor(clerk);
        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);
        p1.setName("生产者p1");
        c1.setName("消费者c1");
        c2.setName("消费者c2");
        p1.start();
        c1.start();
        c2.start();


    }
}

//资源类
class Clerk{
    private int productNum = 0;
    private static final  int MAX_PRODUCT = 20;
    private static  final int MIX_PRODUCT = 1;

    //增加产品
    public synchronized void addProduct(){
        if(productNum < MAX_PRODUCT){
          productNum++;
            System.out.println(Thread.currentThread().getName()+"生产了第"+productNum+"个产品");
            this.notify();
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized  void minusProduct(){
        if (productNum >= MIX_PRODUCT){
            System.out.println(Thread.currentThread().getName()+"消费了第" + productNum + "个产品");
           productNum--;
           this.notify();
        }
        else {

            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
//生产者
class Productor extends Thread{
     private Clerk clerk;
     public Productor(Clerk clerk){
         this.clerk = clerk;
     }
/*是的，这段代码中的`private Clerk clerk;`是一个属性。它是`Producer`类中的一个私有属性，
用来存储引用类型变量`Clerk`的实例。在`Producer`类的构造方法中，我们通过`this.clerk = clerk;`
将传入的`Clerk`对象赋值给了类中的`clerk`属性。这样做的目的是让`Producer`类能够访问和操作`Clerk`对象的属性和方法。
*/

    @Override
    public void run() {
        System.out.println("========生产者开始生产商品=========");
      /*这段代码中的 while(true) 是为了创建一个无限循环，也就是一个始终为真的条件。它会一直循环执行里面的代码，直到程序被显式地中断或者退出。
在这种特定的情况下，这个无限循环被用来模拟一个持续的生产过程。生产者线程会一直执行商品生产的任务，不停地往货架上增加商品，直到某个条件触发停止。
但是，要特别注意的是，使用while(true)需要谨慎，因为它可能导致程序陷入死循环，从而影响整个程序的运行。在实际的生产环境中，我们通常会结合特定的条件来控制循环的终止，如使用 break 语句或者设定一个结束条件。*/
        while(true){
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }

}
//消费者
class Customer extends Thread{
    private Clerk clerk;
    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("========消费开者始消费商品=========");
            while(true){
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
            clerk.minusProduct();

        }
    }
}

