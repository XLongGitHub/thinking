import java.util.Random;
public class ThrowCoins {
    public  static void main(String[]args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            System.out.println(rand.nextFloat());
        }
    }
}