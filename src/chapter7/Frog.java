package chpater7;

class Amphibition {
	
	public  void say(Amphibition am) {
		System.out.println("this is a Amphibition");
	}
}

public class Frog  extends Amphibition {
	
	//重载
	public void say(Amphibition am) {
		System.out.println("this is a Forg");
	}
	public static void main(String[] args) {
		Frog f = new Frog();
		f.say(f);
		
	}
}
