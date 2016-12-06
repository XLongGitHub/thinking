

class StaticTest{
    static int i = 47;
}
class Incrementable{

    public static void main(String [] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        IO.println(StaticTest.i);

        sf.increment();
        IO.println(StaticTest.i);
    }
    static void increment() {
        StaticTest.i++;
    }

}