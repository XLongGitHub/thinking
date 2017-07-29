package chapter10;

interface Counter {
	int next();
}

public class LocalInnerClass {
	public static void println(Object obj) {
		System.out.println(obj);
	}

	private int count = 0;

	Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			LocalCounter() {
				println("LocalCounter");
			}

			public int next() {
				println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}

	Counter getCounter2(final String name) {
		return new Counter() {
			{
				println("Counter()");
			}

			/** 提供实现，并向上转型 */
			public int next() {
				println(name);
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass localInnerClass = new LocalInnerClass();
		Counter c1 = localInnerClass.getCounter("local inner"),
				c2 = localInnerClass.getCounter2("Anonymous inner");

		for (int i = 0; i < 4; i++) {
			println(c1.next());
		}
		
		for (int i = 0; i < 4; i++) {
			println(c2.next());
		}
	}
}
