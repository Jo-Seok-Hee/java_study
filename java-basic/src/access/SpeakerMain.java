package access;

public class SpeakerMain {

    public static void main(String[] args) {

        //Speaker 볼륨 지정 생성자
        Speaker speaker = new Speaker(90);
        //Speaker 볼륨확인
        speaker.volumeInfo();

        //Speaker 볼륨 업
        speaker.volumeUp();
        speaker.volumeInfo();

        //Speaker 볼륨 다운
        speaker.volumeUp();
        speaker.volumeInfo();

    }
}
