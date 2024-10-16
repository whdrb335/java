package java_basic.access.b;

import java_basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {

        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지가 아니라서 deFault 호출 불가능
//        data.deFaultField = 2;
//        data.deFaultMethod();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }

}
