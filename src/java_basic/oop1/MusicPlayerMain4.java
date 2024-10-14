package java_basic.oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();

        //음악플레이어 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeOff();
        // 음악플레이어 상태
        musicPlayer.status();
        // 음악플레이어 끄기
        musicPlayer.off();
    }
}
