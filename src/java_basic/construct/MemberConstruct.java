package java_basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    // 추가
    MemberConstruct(String name, int age) {
        //System.out.println("hello"); 이렇게 첫번째 줄에 딴 것이 있으면 안된다.
        this(name,age,50); // 생성자 내부에서 자신의 생성자를 호출할 수 있다.
        // this() 생성자 코드의 첫줄에만 작성할 수 있다.

    }
    // 첫글자 대문자, void 반환타입이없다.
    // 생성자 이름은 클래스이름과 같아야한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    /*
    * 생성자 장점
    * 1. 중복 호출 제거
    * 2. 유령회원이 시스템 내부에 생기는걸 방지
    * */
}
