package thread;

import org.junit.Test;

public class BitSum {
    /**
     *     a + b = a^b + (a&b)<<1
     *     a ^ b  相当于不进位加法
     *     a&b << 1 进位(同为1的位左移)
     */
    public int sum(int a , int b){
        if (a == 0) return b;
        if (b == 0) return a;
        int newA = a ^ b ;
        int newB = (a&b) << 1;
        return sum(newA, newB);
    }

    @Test
    public void testSum(){
        System.out.println(sum(Integer.MAX_VALUE-5,6));
    }
}
