package practice;

class MyThread1 extends Thread {
 //  @Override
    public void run() {
        int i=0;
        while (i<20) {
            System.out.println("Thread is run concurrentlyy");
            System.out.println("It is first thread");
            i++;

        }
    }
}
        class MyThread2 extends Thread {
  //  @Override
            public void run() {
                int i=0;
                while (i<20) {
                    System.out.println("Means That it give some thing  ");
                    System.out.println("It s  happy");
                    i++;
                }
            }
        }


public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();
    }
}

