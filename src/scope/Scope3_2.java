package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;// 이 코드는 temp가 if안에서만 쓰는데 밖에 까지 선언되어있어서 비효율적이다.
        if (m > 0) {

            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        //System.out.println(temp); 생존이 끝났기때문에 여기서는 temp 못씀
        System.out.println("m = " + m);
    }
}
