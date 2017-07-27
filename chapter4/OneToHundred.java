import java.util.Random;
public class OneToHundred {
    public  static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // System.out.println(i);
        }

        Random rand = new Random(47);
        int first = rand.nextInt(100);
        int next = 0;
        // for (int i = 0; i < 25; i++) {
        //     next = rand.nextInt(47);
        //     if (first < next) {
        //         System.out.println("小于");
        //     } else if (first > next) {
        //         System.out.println("大于");
        //     } else {
        //         System.out.println("等于");
        //     }
        //     first  = next;
        // }

        breakLabel();
    }

    public static void breakLabel() {
        label1:
        for (int i = 0; i < 5; i++) {
            for (int j = 11; j < 16; j++) {
                if (i + j == 12) {
                    System.out.println("16");
                    // break label1;
                    continue label1;
                }
            }
        }
    }
}