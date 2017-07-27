class Book {
    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checkout out");
        } else {
            System.out.println("checkIn");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        // (new Book(true)).checkIn();    
        new Book(true);    //此对象被回收，执行finalize方法
        System.gc();
    }
}