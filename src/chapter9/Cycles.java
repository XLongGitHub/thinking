package chapter9;
interface Cycle {
    void ride();
}

class Unicylce implements Cycle {
    public void ride() {
        System.out.println("ride Unicylce");
    }
}

class Bicycle implements Cycle {
    public void ride() {
        System.out.println("ride Bicycle");
    }
}

class Tricycle implements Cycle {
    public void  ride() {
        System.out.println("ride Tricycle");
    }
}

public class Cycles {
    public void cycleFactory(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        Cycles cycles = new Cycles();
        cycles.cycleFactory(new Unicylce());    
        cycles.cycleFactory(new Bicycle());
        cycles.cycleFactory(new Tricycle());
    }
}

