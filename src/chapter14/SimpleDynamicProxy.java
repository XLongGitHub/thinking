package chapter14;

import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    DynamicProxyHandler(Object proxied)  {
        this.proxied = proxied;
    }
    @Override

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        if (args != null) {
            for (Object arg: args) {
                System.out.println("  " + arg );
            }
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface interface1) {
        interface1.doSomething();
        interface1.doSomethingElse("nonono");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        Interface proxy =(Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), 
        		new Class[]{ Interface.class}, 
        		new DynamicProxyHandler(real));

        consumer(proxy);
    }
}