package thread;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MulitiThreadTest {

    Map m = new HashMap();

    @Test
    public void testMain() throws InterruptedException {
        A a = new  A();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                for(int j = 0; j< 10; j++){
                    a.incr();
                }
            }).start();
        }
        Thread.sleep(2000L);
        System.out.println(a.getI());
    }

    class  A {
        int i = 0;
        public void incr(){
            i++;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
