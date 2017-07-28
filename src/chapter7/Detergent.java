package chpater7;


class Cleanser {
	protected String s = "Cleanser";
	
	public void append(String a) {
		s += a;
	}
	
	public void dilute() {
		append(" dilute() ");
	}
	
	public void apply() {
		append(" apply() ");
	}
	
	public void scrub() {
		append(" scrub() ");
	}
	
	@Override
	public String toString() {
		return s;
	}
}

public class Detergent {
	private  String s = "";
	private Cleanser cleaner = new Cleanser();

	public void append(String s) {
		cleaner.append(s);
	}
	public void scrub() {
		// cleaner.scrub();
		append(" Detergent.scrub() ");
	}

	public void dilute() {
		cleaner.dilute();
	}

	public void apply() {
		cleaner.apply();
	}

	public void foam() {
		append(" foam() ");
	}


	public  static void main(String[] args) {
		Detergent detergent = new Detergent();
		detergent.apply();
		detergent.scrub();
		detergent.dilute();
		detergent.foam();
		System.out.println(detergent.s + "fd");
		System.out.println(detergent.cleaner.s);
	}
}
