package thread;

//创建线程方式：
public class TheadTest01 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我正在看：-------" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.println("我正在写：======" + i);
        }
        TheadTest01 theadTest01 = new TheadTest01();
        theadTest01.start();

    }
}
