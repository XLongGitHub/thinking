import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 5;

        for(int item : createFib(num)) {
            System.out.print(item + "  ");
        }
    }
    public static int[] createFib(int num) {
        if (num <= 0) return new int[0];
        else {
            int [] fibs = new int[num];
            if (num == 1) {
                fibs[0] = 1;
                return fibs;
            } else if (num == 2) {
                fibs[0] = 1;
                fibs[1] = 1;
                return fibs;
            } else {
                fibs[0] = 1;
                fibs[1] = 1;
                for (int i = 2; i < num; i++)  {
                    fibs[i] = fibs[i - 1] + fibs[i - 2];
                }
                return fibs;
            }
        }
    }
}