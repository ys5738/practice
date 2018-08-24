package thread;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HashMapTest {

    @Test
    public void testIterator(){
        Map<String, Object> a = new HashMap<>();
        for(int i = 0; i < 50; i++ ){
            a.put("a" + i, i+20);
        }
        for(String s : a.keySet()){
            System.out.println(a.get(s));
        }
    }

    @Test
    public void testAdd(){
//        float a = 0.1f;
//        float increment = 0.1f;
//        float sum = 0;
//        for(int i = 0; i < 10; i++){
//            sum += increment;
//            System.out.println(sum);
//        }
//
         BigDecimal a = new BigDecimal(1.23);
         for(int i = 0; i < 10 ; i++){
             a = a.add(new BigDecimal(1));
             System.out.println(a.doubleValue());
         }

    }

    @Test
    public void testOr(){
        int a = 7|8;
        int b = 7&8;
        // 异或
        int c = 7^8;
        int d = 8^8;
        // 8取反后为 10111(首1为符号位,负数在内存中为补码存放,10111 取反 11000-> +1 ->11001 即 -9)
        int e = ~8;
        int f = ~7;
        System.out.println(a >> 2);
        System.out.println(b >> 1);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }


}
