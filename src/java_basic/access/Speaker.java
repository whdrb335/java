package java_basic.access;

public class Speaker {
    private int volume; //private 를 쓰면 모든 외부 호출을 막는다(해당클래스 내부에서만 사용가능)

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음량입니다.");
        }
        else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
            System.out.println("현재 음량은 : " + volume);
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 감소합니다");
        System.out.println("현재 음량은 : "  + volume);
    }

    void showVolume() {
        System.out.println("현재 볼륨은 : " + volume);
    }
}
