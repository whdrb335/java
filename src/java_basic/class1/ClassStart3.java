package java_basic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;// 변수선언
        student1 = new Student(); // 객체생성, 인스턴스 ,붕어빵 (x001)참조 값으로 들어간다!
        //student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : "+ student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : "+ student2.age + " 성적 : " + student2.grade);
    }
}
