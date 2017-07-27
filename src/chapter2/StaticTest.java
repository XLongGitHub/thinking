class StaticTest {
    static int i = 12;

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        st1.i = 10;
        System.out.println(st1.i);
        System.out.println(st2.i);
        System.out.println(StaticTest.i);
    }

    
}