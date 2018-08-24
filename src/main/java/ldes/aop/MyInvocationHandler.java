package ldes.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("brfore method:"+ method.getName());
        Object res =  method.invoke(target, args);
        System.out.println("after method:"+ method.getName());
        return  res;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(),
                this.target.getClass().getInterfaces(),
                this);
    }
}
