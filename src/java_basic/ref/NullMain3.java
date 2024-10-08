package java_basic.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);//null
        System.out.println("bigData.data= " + bigData.data);//0

        bigData.data = new Data();
        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);//null.value 기 때문에 null 이다.
    }
}
