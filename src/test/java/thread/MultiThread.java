package thread;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class MultiThread implements Runnable{

    static int a = 0;

    private CountDownLatch latch;

    public MultiThread(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
                this.incr();
        }
        latch.countDown();
    }

    void incr(){
        synchronized (this){
            int b = a + 1;
            Thread.yield();
            a = b;
            a++;
        }
    }

    public static void main(String [] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(1000);
        for(int i = 0; i < 1000; i++){
            new Thread(new MultiThread(latch)).start();
        }
        latch.await();
        System.out.println(a);
    }
}
