package ldes.aop;

import java.lang.reflect.InvocationTargetException;

public class JDKProxyTest {

    public static void main(String [] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        MyInvocationHandler inv = new MyInvocationHandler(new HelloImpl());
//        HelloImpl hello = (HelloImpl) inv.getProxy();
//        hello.sayHello2();
        System.out.println(new JDKProxyTest().replaceSpace(new StringBuilder(" a    a ! ")));
    }

    public String replaceSpace(StringBuilder str) {
        int P1 = str.length() - 1;
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (str.charAt(i) == ' '){
                str.append("占位");
            }
        }
        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }
}
