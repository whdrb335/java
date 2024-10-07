package java_basic.class1;

public class ClassStart5 {

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

        Student[] students = new Student[]{student1,student2};



        for (int i=0; i<students.length; i++) {
            System.out.println("이름 : " + students[i].name + "나이 : " +students[i].age);
        }

        for (int i=0; i<students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + "나이 : " +s.age);
        }

        for(Student s : students) {
            System.out.println("이름 : " + s.name + "나이 : " +s.age);
        }
        // iter 단축키 진짜 많이 씀

        System.out.println();


    }
}
