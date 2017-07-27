/*
    
*/

class Tank {
    float width;
}
public class Pra2 extends IO {
    public static void main(String [] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        //t1.width = Float.parseDouble(14.5);
        t1.width = (float)14.5;
        t2.width = (float)16.6;

        println(" t1.width =  " + t1.width + " t2.width = " + t2.width);

        t1 = t2;

        println(" t1.width =  " + t1.width + " t2.width = " + t2.width);

        t1.width = (float)12.4;

        println(" t1.width =  " + t1.width + " t2.width = " + t2.width);

    }
}