package java_basic.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 객체생성, 인스턴스 ,붕어빵 (x001)참조 값으로 들어간다!
        //student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2; // 대입은 항상 변수에 들어 있는 값을 "복사" 한다 ******

        System.out.println("이름 : " + students[0].name + " 나이 : "+ students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : "+ students[1].age + " 성적 : " + students[1].grade);

        for (int i=0; i<students.length; i++) {
            System.out.println("이름 : " + students[i].name);
            System.out.println("나이 : " + students[i].age);
        }

        System.out.println();

        System.out.println(students[0]);

    }
}
