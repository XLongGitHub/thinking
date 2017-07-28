package chpater7;
class B {
    B() {
        System.out.println("This is b");
    }
}
class A {
    A() {
      System.out.println("This is a");  
    }
}

class InhertInit extends A {
    // static B b = new B();   //output b a
    B b = new B();				//output a b

    public static void main(String[] args) {
        new InhertInit();
    }
}
/**
 * output
 * 
 */