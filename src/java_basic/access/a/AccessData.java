package java_basic.access.a;

public class AccessData {
    public int publicField;
    int deFaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 : " + publicField);
    }

    void deFaultMethod() {
        System.out.println("deFaultMethod 호출 " + deFaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        deFaultField = 200;
        privateField = 300;
        publicMethod();
        deFaultMethod();
        privateMethod();
    }
}
