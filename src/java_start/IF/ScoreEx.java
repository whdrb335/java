package java_start.IF;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 85;
        String status = "";
        if(score >= 90) {
            status = "A";
        }
        else if(score >= 80 && score < 90) {
            status = "B";
        }
        else if(score >= 70 && score < 80) {
            status = "C";
        }
        else if(score >= 60 && score < 70) {
            status = "D";
        }
        else {
            status = "F";
        }
        System.out.println("출력학점은 : " + status);
    }
}
