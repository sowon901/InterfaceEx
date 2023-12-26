package oop.Interface_1;

public interface RemoteControl {
    //1.상수 필드
    int MAX_VOLUME = 30;    //상수 : public static final
    //interface는 compile 과정에서 public static final을 해주지 않아도 자동으로 변환해준다.
    int MIN_VOLUME = 0;

    //2.추상 메소드 : abstract, 또는 바디가 없는 메소드(메소드 선언부만 작성)
    void turnOn();  //전원 켬
    void turnOff(); //전원 끔
    void setVolume(int volume); //볼륨 세팅

    int getVolume();


    //3. 디폴트 인스턴스 메소드 (default method) --> 완전한 실행 코드를 가지고 있는(바디가 있는/실행부가 있는) 유일한 메소드
    default void setMute(boolean mute) {

        if(mute){
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Cancel");
        }
    }

    static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }


}
