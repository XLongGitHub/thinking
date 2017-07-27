public class BloodGhost {

    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            if (isBlood(i))
                System.out.print(i + ", ");
        }
        System.out.print( ", ddddddddddddd");

    }
    public static boolean isBlood(int num) {
        String numStr = "" + num;
    
        for (int i = 10; i < 100; i++) {
            if (num % i == 0) {
                int j = num / i;
                String nString = "" + i + j;
                if (sort(numStr) == sort(nString)) 
                    return true;
            }
        }

        return false;
    }


    public static String sort(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (chars[i] > chars[j]) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
        }
        return new String(chars);
    }
}