package chapter11;

import java.util.ArrayList;

class Apple {
    private static long counter;
    
    private final long id = counter++;

    public long getId() {
        return id;
    }

    public String toString() {
        return "Apple " + id;
    }
}

class Orange {
    private static long counter;
    
    private final long id = counter++;

    public long getId() {
        return id;
    }

    public String toString() {
        return "Orange " + id;
    }
}

public class AppleAndOrange {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
        ArrayList apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            apples.add(new Orange());
        }

        for (Object o : apples) {
            System.out.println(o);
        }
        
//        for (Apple a : apples) {
//        	System.out.println(a);
//        }
    }
}