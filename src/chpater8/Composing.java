package chpater8;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private long id = counter++;

	public Shared() {
		print("creating" + this);
	}

	public void addRef() {
		refcount++;
	}

	public void dispose() {
		if (--refcount == 0) {
			print("disposing" + this);
		}
	}

	public String toString() {
		return " share " + id;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public void finalize() {
		if (refcount == 0) {
			print("no shared");
		}
	}
}

public class Composing {
	private Shared shared;

	private static long counter = 0;
	private long id = counter++;

	public Composing(Shared sh) {
		this.shared = sh;
		print("creating" + this);
		this.shared.addRef();
	}

	public void dispose() {
		print("dispose " + this);
		this.shared.dispose();
	}

	public static void main(String[] args) {
		Composing[] composing = new Composing[5];
		Shared s = new Shared();
		for (int i = 0; i < 5; i++) {
			composing[i] = new Composing(s);
		}

		for (Composing c : composing) {
			c.dispose();
		}
		
		s = null;
		
		for (int i = 0; i < 5; i++) {
			composing[i] = null;
		}
		
		new Shared();
		
		System.gc();
	}

	public String toString() {
		return " Compose " + id;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}
