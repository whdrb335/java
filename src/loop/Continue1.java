package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 이것을 쓰는순간 바로 밑으로 안가고 while 조건문으로 간다.
            }
            System.out.println(i);
            i++;
        }
    }
}
