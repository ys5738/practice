package ldes.aop;

public class HelloImpl implements Hello1,Hello2{

    @Override
    public void sayHello() {
        System.out.println("hello1");
    }

    @Override
    public void sayHello2() {
        System.out.println("hello2");
    }

    public void myHello(){
        System.out.println("my-hello");
    }
}
