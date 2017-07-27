class Dog {
    public String name;
    public String says;
}

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff";

        d2.name = "scr";
        d2.says = "refd";

        System.out.println(d1);
    }
}