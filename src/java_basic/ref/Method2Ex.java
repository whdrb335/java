package java_basic.ref;

public class Method2Ex {
    public static void main(String[] args) {

        Student student1 = createStudent("학생1",15,90);
        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return  student;
    }
}
