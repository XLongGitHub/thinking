package chpater8;

class Cycle {
	public void ride() {
		
	}
}

class Unicycle extends Cycle {
	public void ride() {
		System.out.println("Unicycle");
	}
}

class Bicycle extends Cycle {
    
    public void ride() {
        System.out.println("Bicycle");
    }
}

class Tricycle extends Cycle {
    
    public void ride() {
        System.out.println("Tricycle");
    }
}

public class CycleTest {

    public void ride(Cycle cycle) {
        cycle.ride();
    }
    public static void main(String[] args) {
        CycleTest cycleTest = new CycleTest();

        cycleTest.ride(new Unicycle());
        cycleTest.ride(new Bicycle());
        cycleTest.ride(new Tricycle());
    }
}
