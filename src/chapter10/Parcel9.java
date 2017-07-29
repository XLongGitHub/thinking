package chapter10;
class Destination {}
public class Parcel9 {
    public Destination destination(final String desc) {
        return new Destination() {
            private String label = desc;
            public String readLable() {
                return label;
            }
            
            public String toString() {
            	return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination ds =  parcel9.destination("desc");
        System.out.println(ds);
//        System.out.println(ds.readLable());
    }
}