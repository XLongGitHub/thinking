import java.util.Scanner;

class Speed{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        double distance = sc.nextDouble();

        IO.println("Speed = " + calSpeed(time, distance));
        
    }

    static double calSpeed(double time, double distance) {
        return distance / time;
    }
}