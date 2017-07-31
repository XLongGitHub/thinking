package chapter15;

import java.util.Iterator;
import java.util.Random;

interface Generator<T> { 
    T next();
}

class Coffee {
    private static long counter = 0;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}


class Mocha extends Coffee {}

class Latte extends Coffee {}

class Cappuccino extends Coffee {}

class Americano extends Coffee {}

class Breve extends Coffee {}

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Mocha.class, Latte.class, Cappuccino.class, Americano.class, Breve.class};
    private static final Random rand = new Random(47);
    public CoffeeGenerator() {}

    private int size;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try { 
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
    	
    	int count = size;
    	
		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count --;
			return CoffeeGenerator.this.next(); //内部类调用外部方法
		} 
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
    	
    }
    
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	
	public static void main(String[] args) {
		CoffeeGenerator cg = new CoffeeGenerator();
		for (int i = 0; i < 5; i++)
			System.out.println(cg.next());
		
		for (Coffee c : new CoffeeGenerator(5)) 
			System.out.println(c);
		
	}

}