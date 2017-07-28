package chapter9;
/**
 * 策略模式
 * @author Xulong
 *
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {return input;}
}

class Upcase extends Processor {
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Lowcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

public class Apply {
    public static String s = "Hello World !";
    public static void process(Processor p, Object s) {
        System.out.println("Using Process " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Lowcase(), s);
    }

}
