package java_start.IF;

public class MovieRateEx {
    public static void main(String[] args) {
        double rate = 9;

        if (rate == 7) {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'을 추천합니다.");
            System.out.println("'고질라'를 추천합니다.");
        }
        else if (rate >= 7.1 && rate < 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'을 추천합니다.");
        }
        else if (rate >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
    }
}
