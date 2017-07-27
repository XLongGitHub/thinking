enum Colors {
    RED, GREEN, BLUE, WHITE, BLACK, PINK, YELLOW
}
public class EnumTest {
    public static void main(String[] args) {
        for (Colors colors: Colors.values()) {
            System.out.println(colors + " : " + colors.ordinal());
        }    
    }
}