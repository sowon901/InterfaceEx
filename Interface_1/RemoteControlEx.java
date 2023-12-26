package oop.Interface_1;

public class RemoteControlEx {
    //실행객체
    public static void main(String[] args) {
        //1. 상수는 구현 객체와 상관없는 인터페이스 멤버(static멤버)이므로 바로 접근해서 상수값을 읽을 수 있다.
        //System.out.println(RemoteControl.MAX_VOLUME);
        //System.out.println(RemoteControl.MIN_VOLUME);

        RemoteControl remoteControl;
       // RemoteControl samsung  = new TV();
        remoteControl = new TV();
        //TV객체를 생성하여 인터페이스타입 변수에 주입(Injection)


        /*samsung.turnOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        samsung.setVolume(20);
        System.out.println(samsung.MAX_VOLUME + samsung.MIN_VOLUME);
        samsung.turnOff();*/

        //remoteControl 인터페이스 객체가 호출된다.
        //turnOn의 하위 객체인 TV객체의 turnon()을 호출. 상속받은 하위클래스로 내려가서 나를 재정의한
        remoteControl.turnOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        System.out.println(remoteControl.MAX_VOLUME + remoteControl.MIN_VOLUME);
        remoteControl.turnOff();
        //tv를 선택했는지 radio를 대상으로 동작시킨건지는 내부에서만 알 수 있음.
        //내부에 있는 내부자만 remoteControl을 통해서 직접 control이 가능하다.
        //->느슨한 결합, 확장 가능,


       //  remoteControl  = new Radio();

        //위와 똑같이 쓰면 tv로 실행. radio인지 tv인지 모름.
        

        /*RemoteControl lgRadio = new Radio();
        lgRadio.turnOn();
        lgRadio.turnOff();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        lgRadio.setVolume(30);
        System.out.println(lgRadio.MAX_VOLUME+ lgRadio.MIN_VOLUME);
        lgRadio.turnOff();*/
        remoteControl.setMute(true);
        remoteControl.setMute(false);
        RemoteControl.changeBattery();

    }
}
