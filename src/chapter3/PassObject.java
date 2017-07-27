class Letter{
    float price;
}

public class PassObject extends IO{
    private static void f(Letter l) {
        l.price = 12;
    } 

    public static void main(String [] args) {
        Letter x = new Letter();
        x.price = 23;

        println("price = " + x.price);
        f(x);
        println("price = " + x.price);
        
    }
}