package java_basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 지역변수와 멤버변수 변수이름이 다르면 this 생략 가능
        nameField = nameParameter;
    }
}
