public class VarsChange {
    
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};
        new VarsChange().output(strings);
    }

    /**
     * 可变参数列表
     */
    public void output(String ... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}