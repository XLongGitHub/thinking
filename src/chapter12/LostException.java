package chapter12;

public class LostException {
	public static void main(String[] args) {
		try {
			throw new Exception("exception");
		} finally {
			return;
		}
	}
}
