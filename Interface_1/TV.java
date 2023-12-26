package oop.Interface_1;

public class TV implements RemoteControl{

    //remotecontrol통해서 볼륨과 전원키고 끄는 기능 수행할 수 있다.
    //RemoteControl 인터페이스를 기준으로 해당 TV클래스를 구현하세요.
    //SAMSUNG TV 객체를 하나 생성하여 다음과 같은 동작을 차례로 수행시키세요.
    //1. 전원을 켠다
    //2. 해당 TV의 기본 MAX_VOLUME과 MIN_VOLUME 값을 확인한다.
    //3. TV의 볼륨을 20으로 셋팅하고 값을 확인한다.

    private int vol = 0;
    private int memoryVol = 0;

        @Override
        public void turnOn() {
            System.out.println("TV 전원을 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV 전원을 끕니다.");
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

            System.out.println("현재 볼륨: " + this.vol);
        }

        public int getVolume() {
            System.out.println("설정한 TV 볼륨은" + vol+ "입니다.");
            return this.vol;
        }

    //3. 디폴트 인스턴스 메소드 (default method) --> 완전한 실행 코드를 가지고 있는(바디가 있는/실행부가 있는) 유일한 메소드

    //default는 interaface만 사용 가능하므로 오버라이딩 하려면 public으로 변환해줘야한다.
    public void setMute(boolean mute) {
        this.memoryVol = this.vol;
        if(mute){
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Cancel");
            this.vol = this.memoryVol;
            System.out.println("현재 볼륨:" + this.vol);
        }
    }

    public static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }


    //RemoteControl 의 setMute() : 무음 처리 기능을 TV 클래스에서 기존의 볼륨을 기억하여 복원시키는 기능으로 재정의하시오.




}

