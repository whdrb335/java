package java_basic.ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // 참조할 대상이 없다.

        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = "+ data);
    }
}
