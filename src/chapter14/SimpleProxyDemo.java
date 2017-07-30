package chapter14;
/**
 * 简单代理
 */
interface Interface {
    void doSomething();
    void doSomethingElse(String args);
}

class RealObject implements Interface {
    
    @Override
    public void doSomething() {
        System.out.println("doSomething");    
    }

    @Override
    public void doSomethingElse(String args) {
        System.out.println("doSomethingElse " + args);
    }
}


class SimpleProxy implements Interface {
    private Interface interface1;

    SimpleProxy(Interface interface1) {
        this.interface1 = interface1;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        interface1.doSomething();
    }

    @Override
    public void doSomethingElse(String args) {
        System.out.println("SimpleProxy doSomethingElse " + args);
        interface1.doSomethingElse(args);
    }
}
public class SimpleProxyDemo {

    public static void dodo(Interface interface1) {
        interface1.doSomething();
        interface1.doSomethingElse("else");
    }
    public static void main(String[] args) {
        dodo(new RealObject());
        System.out.println();
        dodo(new SimpleProxy(new RealObject()));
    }
}