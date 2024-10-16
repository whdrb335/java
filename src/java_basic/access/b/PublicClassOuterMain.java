package java_basic.access.b;

import java_basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가(컴파일 오류)
        //DefaultClass1 defaultClass = new DeFaultClass1();
        //DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}
