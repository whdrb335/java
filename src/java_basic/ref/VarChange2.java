package java_basic.ref;

public class VarChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // A와B가 같은 참조값을 가지게 되고 같은 인스턴스를 참조하게 된다.

        System.out.println("dataA 참조값=" + dataA); // dataA의 참조값 주소
        System.out.println("dataB 참조값=" + dataB); // dataA의 참조값과 같다
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        //dabaB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value);// 30
    }
}
