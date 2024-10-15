package java_basic.pack;

import java_basic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        java_basic.pack.b.User userB = new java_basic.pack.b.User(); // User가 같으면 어쩔수 없이 하나는 저렇게 다 적어야한다.
    }
}
