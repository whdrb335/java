package java_basic.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("종규", 30,80); // 객체를 생성하면서 바로 호출한다!
        MemberConstruct member2 = new MemberConstruct("보현", 16); // 직접 정의한 생성자를 반드시 호출!
        //MemberConstruct member2 = new MemberConstruct(); 안에 값을 빼먹으면 아예 실행이 안되기때문에 실수를 방지할 수 있다.(제약)
        // 생성자를 사용하면 필수값 입력을 보장할 수 있다.
        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : "+ member.age + ", 성적 : " + member.grade);
        }

    }
}
