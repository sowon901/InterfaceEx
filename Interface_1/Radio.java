package oop.Interface_1;

public class Radio implements RemoteControl{

    private int vol;
    @Override
    public void turnOn() {
        System.out.println("라디오 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오 전원을 끕니다.");
    }

    public void getDefaultMAXAndMIN() {
        System.out.printf("기본 MAX 값은 %d, 기본 MIN 값은 %d입니다.", RemoteControl.MAX_VOLUME, RemoteControl.MIN_VOLUME);
    }

    @Override
    public void setVolume(int volume) { //추상메소드 재정의 (오버라이딩 : overriding)
        //인터페이스 상수 MAX_VOLUME과 LOW_VOLUME 사용하여
        if(volume > RemoteControl.MAX_VOLUME){
            this.vol = RemoteControl.MAX_VOLUME-15;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.vol = RemoteControl.MIN_VOLUME;
        } else
            this.vol = volume;
    }

    public int getVolume() {
        System.out.println("설정한 라디오 볼륨은" + vol+ "입니다.");
        return this.vol;
    }

}
