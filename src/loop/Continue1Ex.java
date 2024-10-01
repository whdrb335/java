package loop;

public class Continue1Ex {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {

            System.out.println(i);
            i++;
            if(i == 3) {
                i++;
                continue;
            }
        }
    }
}
