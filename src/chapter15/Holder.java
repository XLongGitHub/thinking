package chapter15;

class Automobile {
}

public class Holder<T> {
	/*//method 1
	//只能持有单个类型的对象
	private Automobile a;
	
	Holder(Automobile a) {
		this.a = a;
	}
	
	public Automobile get() {
		return a;
	}*/
	
/*	//method 2
	private Object a;
	
	Holder(Object a) {
		this.set(a);
	}

	public Object get() {
		return a;
	}

	public void set(Object a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		Holder h = new Holder(new Automobile());
		Automobile a = (Automobile) h.get();
		
		h = new Holder(new String("hello"));
		String s = (String) h.get();
		
		h = new Holder(new Integer(100));
		int i = (int) h.get();
	}
*/	
	
	private T a;
	
	public Holder(T a) {
		this.a = a;
	}
	
	public T get() {
		return a;
	}
	
	public void set(T a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		Holder<Automobile> h = new Holder<Automobile>(new Automobile());
		System.out.println(h.get().getClass().getSimpleName());
	}
	
}
