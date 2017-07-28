package chapter6.access;

public class ProtectTest2 {
	public static void main(String[] args) {
		ProtectTest1 t1 = new ProtectTest1();
		t1.say();  //访问包中的protected方法
	}
}
