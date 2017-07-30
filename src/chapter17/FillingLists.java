package chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
	private String s;
	
	StringAddress(String s) {
		this.s = s;
	}
	
	public String toString() {
		return super.toString() + " " + s;
	}
	
}

public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("hello ")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("world")); //替换已存在的元素
		System.out.println(list);
	}
}
