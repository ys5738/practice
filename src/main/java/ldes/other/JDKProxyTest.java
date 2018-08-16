package ldes.other;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class JDKProxyTest {

    public static void main(String [] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MyInvocationHandler inv = new MyInvocationHandler(new HelloImpl());
        HelloImpl hello = (HelloImpl) inv.getProxy();
        hello.sayHello2();

    }
}
