package chapter11;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        String chars = "";
        String operate = "";
        Stack stack = new Stack<>();        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
//            	System.out.println((str.charAt(i) != '+'));
//            	System.out.println((str.charAt(i) != '-'));
            	  operate += str.charAt(i);
            } else {
              
                chars += str.charAt(i);
            }
        }
        System.out.println(chars);
        System.out.println(operate);
        int pos = 0;
        for (int i = 0; i < operate.length(); i++) {
            if (operate.charAt(i) == '+') {
                stack.add(chars.charAt(pos++));
            } else {
                System.out.println(stack.pop());
            }
        }
        System.out.println(1231);


    }
}