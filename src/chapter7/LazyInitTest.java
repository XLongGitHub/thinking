package chpater7;
/**
 * 惰性初始化
 */
class Basketball {
    private static int order;

    Basketball() {
        System.out.println("basketball init");
    }

    public String toString() {
        return "The order is " + order;
    }
}


public class LazyInitTest {
    private Basketball ba;

    public void play() {
        if (ba == null) {
            ba = new Basketball();
        }
    }

    public static void main(String[] args) {

        new LazyInitTest().play();
    }
}