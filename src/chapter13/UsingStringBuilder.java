package chapter13;

import java.util.Random;

public class UsingStringBuilder {
    public static Random rand = new Random(47);

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(100));
            sb.append(", ");
        }
        //删除最后一个逗号和空格
        sb.delete(sb.length() -2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}