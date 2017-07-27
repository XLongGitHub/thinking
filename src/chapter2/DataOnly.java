class DataOnly{
    int i;
    double d;
    boolean b;

    public static void main(String [] args) {
        //方法变量需要进行赋初值。
        int a;
        double d;
        Boolean b;

        DataOnly data = new DataOnly();
        
       // IO.println("成员变量：");
        IO.println(data.i);
        IO.println(data.d);
        IO.println(data.b);

        IO.println("方法变量：");
        IO.println(a);
        IO.println(d);
        IO.println(b);

        data.i = 47;
        data.d = 1.1;
        data.b = false;

        IO.println("成员变量：");
        IO.println(data.i);
        IO.println(data.d);
        IO.println(data.b);
    }
}