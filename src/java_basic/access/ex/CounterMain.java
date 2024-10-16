package java_basic.access.ex;

public class CounterMain {
    public static void main(String[] args) {

        CounterAccount counterAccount = new CounterAccount();
        counterAccount.increment(3);
        counterAccount.increment(3);
        counterAccount.increment(3);
        counterAccount.increment(3);

        int count = counterAccount.getCount();
        System.out.println(count);
    }
}
