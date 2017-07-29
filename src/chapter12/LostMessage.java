package chapter12;

class VeryImportantException extends Exception {
	public String toString() {
		return "very important exception";
	}
}

class HoException extends Exception {
	public String toString() {
		return "Ho Exception";
	}
}
public class LostMessage {
	
	public void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	public void dispose() throws HoException {
		throw new HoException();
	}
	
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
