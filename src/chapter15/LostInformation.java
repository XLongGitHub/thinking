package chapter15;

import java.util.*;

/**
 * 泛型代码内部，无法获取泛型信息
 */
class Frob {}

class Fonrkle {}

class Quark<Q> {}

class Particle {}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fonrkle> map = new HashMap<>();
        Quark<Fonrkle> quark = new Quark<Fonrkle>();
        
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        
    }
}
