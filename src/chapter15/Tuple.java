package chapter15;


class TwoTuple<A, B> {
	@Override
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}

	public final A first;
	public final B second;
	
	public TwoTuple(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}	
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

	public ThreeTuple(A first, B second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

	public FourTuple(A first, B second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}
}

class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

	public FiveTuple(A first, B second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}
	
}

class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

	public SixTuple(A first, B second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}
	
}

public class Tuple {

}
