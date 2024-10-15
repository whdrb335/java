package java_basic.pack;


import java_basic.pack.a.*; // 뒤에 * 이 붙으면 패키지 뒤에 모든 걸 사용할수 있다.

public class PackageMain1 {
    public static void main(String[] args) {

        Data data = new Data();
        // pack.a user = new pack.a.User 원래는 이렇게 해야한다.
        User user = new User();
        User2 user2 = new User2();
    }
}
