package thread;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

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
}
