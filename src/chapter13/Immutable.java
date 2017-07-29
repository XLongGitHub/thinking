package chapter13;
public class Immutable {
    public static void main(String[] args) {
        String q = "hello world";
        System.out.println(q);
        String p = q.toUpperCase();
        System.out.println(q);
        System.out.println(p);

    }
}