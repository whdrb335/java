package java_basic.class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studends = {"학생1", "학생2","학생3"};
        int[] studentAges = {15,11,20};
        int[] studentGrade = {90,80,60};


        for(int i=0; i<studends.length; i++) {
            System.out.println("이름 : "+studends[i] + " 나이: "+studentAges[i] + " 성적 : " + studentGrade[i]);
        }
    }
}
