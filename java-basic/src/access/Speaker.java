package access;

public class Speaker {

    int volume;
    
    //Speaker 생성자
    Speaker(int volume) {

        this.volume = volume;
    }

    //Speaker 스피커 볼륨증가
    void volumeUp() {

        if (volume >= 100) {

            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {

            volume = volume + 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    //Speaker 스피커 음략감소
    void volumeDown() {

        if (volume > 0) {

            volume = volume - 10;
            System.out.println("음량을 10 감소합니다.");
            if (volume <= 0) {

                volume = 0;
                System.out.println("음량을 더 이상 감소할 수 없습니다.");
            }
        } else {

            System.out.println("음량이 0 입니다. 더 이상 감소할 수 없습니다.");

        }
    }

    //Speaker 스피커 음량 확인
    void volumeInfo() {

        System.out.println("현재 음량 : " + volume);
    }
}
