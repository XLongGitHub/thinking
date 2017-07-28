package chpater7;

import java.util.Random;
/**
 * 验证有static和无static时，final的不同表现
 * @author Xulong
 *
 */
public class FinalStaticTest {
	static Random rand = new Random(47);
	private static final int num = rand.nextInt(10);
	private final int order = rand.nextInt(10);
	
	@Override
	public String toString() {
		return "num : " + num + " order: " + order;
	}
	
	public static void main(String[] args) {
		FinalStaticTest fs1 = new FinalStaticTest();
		FinalStaticTest fs2 = new FinalStaticTest();
		
		System.out.println(fs1);
		System.out.println(fs2);
		
		for (int i = 0; i < 100; i++)
			System.out.println(new FinalStaticTest());
	}
}
