package tests;

public class MultiThreadTest_Runnable implements Runnable {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MultiThreadTest_Runnable().createThread(1);
        Thread t2 = new MultiThreadTest_Runnable().createThread(2);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread " + i);
        }

    }

    public Thread createThread(int i) {
        Thread t = new Thread(this, "thread" + i);
        System.out.println("Child thread " + t);
        return t;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName() + " -> " + i);

        }
    }

}
