package chapter10;

public class Outer {
	class Inner {
		private String name;

		Inner(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Inner : " + name;
		}
	}

	public Inner getInner(String name) {
		return new Inner(name);
	}

	public static void main(String[] args) {
		Inner inner = new Outer().getInner("first");
		System.out.println(inner);
	}
}