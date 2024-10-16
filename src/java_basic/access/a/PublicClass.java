package java_basic.access.a;

public class PublicClass { // public class 이름은 반드시 자바 파일 이름과 같아야한다!
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DeFaultClass1 deFaultClass1 = new DeFaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DeFaultClass1 {

}

class DefaultClass2 {

}
