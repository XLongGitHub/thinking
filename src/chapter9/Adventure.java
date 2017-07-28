package chapter9;
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {}  //在接下来的组合中，提供了对CanFight中fight方法的实现
}

class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim {
    public void swim() {};
    public void fly() {};
    public void climb() {};
}

public class Adventure {
    
}