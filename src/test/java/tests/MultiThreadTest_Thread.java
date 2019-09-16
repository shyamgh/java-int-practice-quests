package tests;

import java.util.HashSet;
import java.util.Set;

public class MultiThreadTest_Thread extends Thread {

    public MultiThreadTest_Thread(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MultiThreadTest_Thread("Thread1");
        Thread t2 = new MultiThreadTest_Thread("Thread2");

        t1.start();
        t1.join();

        t2.start();
        //t2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread " + i);
        }

        Set s = new HashSet<String>();

        s.add("a");

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

}

class A {

    private void f() {

    }
}

class B extends A {

    public void f() {

    }
}

interface i1 {

}

interface i2 extends i1 {

}

interface i3 extends i2, i1 {

}