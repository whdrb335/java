package java_basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 지역변수와 멤버변수 변수이름이 다르면 this 생략 가능
        this.nameField = nameParameter; // 요즘에는 위에 변수랑 밑에 변수가 색깔로 알수있기때문에 굳이 this를 쓰지않는게 요즘 스타일이다.
    }
}
