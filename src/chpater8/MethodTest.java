package chpater8;
class BaseC1 {
    public void m1() {
        m2();
    }

    public void m2() {
        System.out.println("baseC1");
    }
}

class ChildC1 extends BaseC1 {
    @Override
    public void m2() {
        System.out.print("ChildC1");
    }
}

public class MethodTest {
    public static void main(String[] args) {
        BaseC1 cc1 = new ChildC1();
        cc1.m1();
    }
}