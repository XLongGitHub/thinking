class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("yum");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        System.out.println("install");
        return apple;
    }
}
class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat(new Apple());
    }
}