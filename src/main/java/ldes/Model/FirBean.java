package ldes.Model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class FirBean implements InitializingBean{

    int a;

    String b;

    public FirBean(int a , String b){
        this.a = a;
        this.b = b;
        System.out.println("construct@1@");
    }

    public FirBean(){
        this.a = 3;
        this.b = "nonPraam-construct";
        System.out.println("construct@2@");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    @Override
    public String toString() {
        return "FirBean{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
