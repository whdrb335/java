package java_basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(){ // 생성자 필요

    }

    // 추가
    void initMember(String name, int age, int grade) {
        // this. 자기자신의 참조값를 불러온다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
