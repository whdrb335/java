package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(3);
        System.out.println(result);

    }

    public static boolean odd(int i) {
        if (i % 2==1) {
            return true; // return 문을 만나면 바로 빠져나간다.
        }
        return false;
    }
}
