package chapter14;
import java.util.*;
/**
 * 根据运行时获得的类信息，动态创建实例
 */
class CountedInteger {
    private static long counter;

    private final long id = counter++;

    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int n) {
        List<T> list = new ArrayList<T>();

        try { 
            for (int i = 0; i < n; i++) {
                list.add(type.newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(10));
    }
}

