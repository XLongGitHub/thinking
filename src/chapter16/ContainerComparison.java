package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}
public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];

        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        println(Arrays.toString(spheres));
        println(spheres[4]);

        List<BerylliumSphere> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(new BerylliumSphere());
        }
        println(list);
        println(list.get(4));

        int[] integers = {1, 2, 3, 4, 5, 6};
        // IO.println(Arrays.asList(integers));
        println(Arrays.asList(integers));
        println(Arrays.toString(integers));

        
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }
}