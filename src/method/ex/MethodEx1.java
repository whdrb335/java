package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {

        System.out.println(avg(1,2,3));
        System.out.println(avg(15,25,35));

    }



    public static double avg(int a, int b, int c) {
        double avg = (a+b+c)/3.0;
        return avg;
    }
}
