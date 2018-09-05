package thread;

import org.junit.Test;
import utils.MathUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
        System.out.println(sum(Integer.MAX_VALUE,0));
        System.out.println(1/10);
    }

    @Test
    public void testReverseInt(){
        System.out.println(reverseInt(-153423646));
    }
    public int reverseInt(int x){
        int res = 0;
        while(x != 0){
            int temp = x % 10;
            x /= 10;
            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && temp > 7) return 0;
            if(res < Integer.MIN_VALUE/10 || res == Integer.MAX_VALUE/10 && temp < -8) return 0;
            res = res * 10 + temp;
        }
        return res;
    }


    public void printArr(int[] a){
        for(int i = 0; i < a.length; i++ ){
            System.out.println(a[i]);
        }
    }

    @Test
    public void testDouble(){
        List s = new ArrayList(8);
        System.out.println(s.size());
        s.add(12);
        s.add(123);
        s.add("asd");
        System.out.println(s.size());
        Iterator i = s.iterator();
        i.next();
        i.remove();
        System.out.println(s);
        System.out.println(s.size());

        double b = s.size();
        double d = 1/b;
        System.out.println(d);

        System.out.println();
    }

    public static List<Double> getDistributionSegment(double max, double min, int count){
        double numOffset = Math.ceil(MathUtils.log2(count));
        double r = (max - min) / numOffset;
        double b = Math.floor(Math.log10(r));
        double a = Math.ceil(r / Math.pow(10, b));
        double width = a * Math.pow(10, b);
        double lowbound = Math.floor(min / width) * width;
        double h5 = width * numOffset + lowbound;
        int fence = 0;
        if(h5 < max){
            fence = (int) (numOffset +1); //最终分段数量
        } else {
            fence = (int) numOffset;
        }
        System.out.println(lowbound + "/" + width + "/" + fence);

        List<Double> res = new ArrayList<>(fence);
        res.add(lowbound);
        for(int i = 1; i <= fence; i++){
            BigDecimal temp = BigDecimal.valueOf(width).add(BigDecimal.valueOf(res.get(i-1)));
            res.add(temp.doubleValue());
        }
        return res;
    }

    @Test
    public void run(){
        System.out.println(getDistributionSegment(0.52,0.12, 22));
        List a = new ArrayList<>();
        a.add(2);

        List b = new ArrayList<>();
        b.add(3);
        b.add(4);

        List c = new ArrayList<>();
        c.add(6);
        c.add(5);
        c.add(7);

        List d = new ArrayList<>();
        d.add(4);
        d.add(1);
        d.add(8);
        d.add(3);

        List l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

        //System.out.println(minimumTotal(l));

        List list = new ArrayList();
        list.add(12);
        list.add(11);
        list.add(11);

        list.add(1,123);
        System.out.println(list);
    }

    /**
     * https://leetcode.com/problems/triangle/description/
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> temp = new ArrayList<>(triangle);
        for(int i = triangle.size()-2; i >= 0; i--){
            List<Integer> in = triangle.get(i);
            List<Integer> current = temp.get(i);
            List<Integer> last = temp.get(i + 1);
            for(int j = 0; j < in.size(); j++){
                current.set(j, in.get(j) + Math.min(last.get(j), last.get(j + 1)));
            }
        }
        return temp.get(0).get(0);
    }
}