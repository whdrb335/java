package java_start.IF;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 50;
        String status = "";

        if(distance <= 1) {
            status = "도보";
        }
        else if (distance <= 10) {
            status = "자전거";
        }
        else if (distance <= 100) {
            status = "자동차";
        }
        else if (distance > 100) {
            status = "비행기";
        }
        System.out.println(status + "를 이용하세요.");
    }
}
