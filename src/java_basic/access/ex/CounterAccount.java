package java_basic.access.ex;

public class CounterAccount {
    private int count;


    public void increment(int max) {
        if (isValidCount(max)) {
            count++;
        }
        else {
            System.out.println("더이상 늘리지못합니다.");
        }
    }


    private boolean isValidCount(int max) {
        return max >= count;
    }

    public int getCount() {
       return count;
    }
}
